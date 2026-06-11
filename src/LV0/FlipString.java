// 문제: 문자열 뒤집기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181905
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class FlipString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int s = sc.nextInt();
        int e = sc.nextInt();

        StringBuilder sb = new StringBuilder(str);
        for(int i = s; i <= e; i++){
            sb.setCharAt(i, str.charAt(e));
            sb.setCharAt(e, str.charAt(i));
            e--;
            str = sb.toString();
        }

        System.out.println(sb.toString());
    }
}
