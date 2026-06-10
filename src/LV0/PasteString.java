// 문제: 글자 이어 붙여 문자열 만들기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181915
// 날짜: 2026-06-10

package LV0;
import java.util.*;
public class PasteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int [] ar = new int[11];
        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }

        StringBuilder result = new StringBuilder();
        for(int i = 0; i < ar.length; i++){
            result.append(s.charAt(ar[i]));
        }

        System.out.println(result);
    }
}
