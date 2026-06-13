# AGENTS.md — Agent instructions (language-focused)

Purpose
- Provide concise, actionable guidance for AI coding agents working on this Java solutions repository.

Where to look
- Primary source: [README.md](README.md) for project goals and structure.
- Solutions live under `src/LV0`, `src/Lv1`, etc.; each file is typically a single-class Java solution.

Build & run (local, minimal)
- Compile all sources:

```
javac -d bin $(find src -name "*.java")
```

- Run a specific class (replace `MainClass` with the class name containing `main`):

```
java -cp bin MainClass
```

Conventions & assumptions
- Files are standalone solution classes (usually no `package` declarations).
- Filenames match public class names; keep that mapping when renaming or moving files.
- Use `Scanner` for stdin parsing and `System.out.println` for outputs to match judges.
- Keep implementations minimal and focused on one problem per file.

Agent behavior guidance
- Prefer small, targeted edits. Preserve existing problem solutions unless fixing a clear bug.
- When adding helper code or tests, place them in a new directory (e.g., `tools/` or `test/`) and do not modify original solution files unless necessary.
- Use Java LSP tools for precise navigation when available (e.g., `lsp_java_findSymbol`).

Suggested next customizations
- Add `.github/copilot-instructions.md` if you want repository-level agent policies (e.g., pull request style, test requirements).
- Add simple run scripts (`build.sh`, `run.sh`) to standardize commands on macOS/Linux.

If you want more, tell me which language aspect to expand (compilation, testing, formatting, CI).