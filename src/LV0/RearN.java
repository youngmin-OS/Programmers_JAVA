// 문제: 문자열의 뒤의 n글자
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181910
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class RearN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int index = s.length() - n;
        for(int i = index; i < s.length(); i++){
            sb.append(s.charAt(i));
        }

        System.out.println(sb.toString());
    }
}
