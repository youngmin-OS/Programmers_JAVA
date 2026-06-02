// 문제: 문자열 곱하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181940
// 날짜: 2026-06-02

package LV0;
import java.util.*;

public class MyString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder(s);
        for(int i = 0; i < k; i++){
            System.out.print(sb);
        }
    }
}
