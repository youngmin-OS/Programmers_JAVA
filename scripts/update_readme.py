#!/usr/bin/env python3
from __future__ import annotations

import re
import subprocess
from collections import defaultdict
from dataclasses import dataclass
from datetime import datetime
from pathlib import Path


ROOT = Path(__file__).resolve().parents[1]
SRC_DIR = ROOT / "src"
README = ROOT / "README.md"

START = "<!-- SOLUTIONS:START -->"
END = "<!-- SOLUTIONS:END -->"


@dataclass(frozen=True)
class Solution:
    level: str
    title: str
    path: Path
    url: str | None
    solved_on: str | None


def read_metadata(path: Path) -> tuple[str | None, str | None, str | None]:
    title = None
    url = None
    solved_on = None
    for line in path.read_text(encoding="utf-8").splitlines()[:30]:
        match = re.match(r"\s*//\s*(문제|title)\s*:\s*(.+?)\s*$", line, re.IGNORECASE)
        if match:
            title = match.group(2)
            continue

        match = re.match(r"\s*//\s*(URL|link)\s*:\s*(https?://\S+)\s*$", line, re.IGNORECASE)
        if match:
            url = match.group(2)
            continue

        match = re.match(r"\s*//\s*(날짜|date|solved|solved_on)\s*:\s*(\d{4}-\d{2}-\d{2})\s*$", line, re.IGNORECASE)
        if match:
            solved_on = match.group(2)

    return title, url, solved_on


def first_git_commit_date(path: Path) -> str | None:
    result = subprocess.run(
        ["git", "log", "--follow", "--diff-filter=A", "--format=%cs", "--", path.relative_to(ROOT).as_posix()],
        cwd=ROOT,
        text=True,
        stdout=subprocess.PIPE,
        stderr=subprocess.DEVNULL,
        check=False,
    )
    dates = [line.strip() for line in result.stdout.splitlines() if line.strip()]
    return dates[-1] if dates else None


def file_modified_date(path: Path) -> str:
    return datetime.fromtimestamp(path.stat().st_mtime).date().isoformat()


def solved_date(path: Path, metadata_date: str | None) -> str | None:
    return metadata_date or first_git_commit_date(path) or file_modified_date(path)


def fallback_title(path: Path) -> str:
    return path.stem


def level_sort_key(level: str) -> tuple[int, str]:
    match = re.search(r"\d+", level)
    return (int(match.group()) if match else 9999, level)


def collect_solutions() -> list[Solution]:
    if not SRC_DIR.exists():
        return []

    solutions: list[Solution] = []
    for path in sorted(SRC_DIR.rglob("*.java")):
        relative = path.relative_to(SRC_DIR)
        level = relative.parts[0] if len(relative.parts) > 1 else "기타"
        title, url, metadata_date = read_metadata(path)
        solutions.append(
            Solution(
                level=level,
                title=title or fallback_title(path),
                path=path.relative_to(ROOT),
                url=url,
                solved_on=solved_date(path, metadata_date),
            )
        )

    return sorted(solutions, key=lambda item: (level_sort_key(item.level), item.title, str(item.path)))


def markdown_link(label: str, target: str) -> str:
    escaped = label.replace("|", "\\|")
    return f"[{escaped}]({target})"


def render_generated(solutions: list[Solution]) -> str:
    by_level: dict[str, list[Solution]] = defaultdict(list)
    for solution in solutions:
        by_level[solution.level].append(solution)

    lines = [
        START,
        "",
        "## 풀이 현황",
        "",
        f"- 총 풀이 수: {len(solutions)}",
    ]

    if by_level:
        counts = ", ".join(f"{level} {len(items)}문제" for level, items in sorted(by_level.items(), key=lambda item: level_sort_key(item[0])))
        lines.append(f"- 레벨별 풀이: {counts}")

    lines.extend(["", "## 문제 목록", ""])

    if not solutions:
        lines.append("아직 등록된 풀이가 없습니다.")
    else:
        for level, items in sorted(by_level.items(), key=lambda item: level_sort_key(item[0])):
            lines.extend(
                [
                    f"### {level}",
                    "",
                    "| 번호 | 문제 | 풀이 날짜 | 풀이 |",
                    "| ---: | --- | --- | --- |",
                ]
            )
            for index, solution in enumerate(items, start=1):
                title = markdown_link(solution.title, solution.url) if solution.url else solution.title.replace("|", "\\|")
                path = solution.path.as_posix()
                lines.append(f"| {index} | {title} | {solution.solved_on or '-'} | {markdown_link(path, path)} |")
            lines.append("")

    lines.append(END)
    lines.append("")
    return "\n".join(lines)


def update_readme(generated: str) -> None:
    if README.exists():
        current = README.read_text(encoding="utf-8")
    else:
        current = "# Programmers Java\n\n"

    if START in current and END in current:
        before = current.split(START, 1)[0].rstrip()
        after = current.split(END, 1)[1].lstrip()
        next_content = f"{before}\n\n{generated}{after}"
    else:
        next_content = f"{current.rstrip()}\n\n{generated}"

    README.write_text(next_content, encoding="utf-8")


def main() -> None:
    update_readme(render_generated(collect_solutions()))


if __name__ == "__main__":
    main()
