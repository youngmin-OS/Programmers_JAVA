// 문제: 문자열 반복 출력
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181938
// 날짜: 2026-05-29

package LV0;
import java.util.*;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++){
            System.out.print(s);
        }
    }
}
