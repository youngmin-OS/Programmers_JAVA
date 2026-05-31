// 문제: 내적
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/70128
// 날짜: 2026-06-01

package Lv1;
import java.util.*;

public class InnerProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        int []b = new int[n];

        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }

        int result = 0;
        for(int i = 0; i < n; i++){
            result += (a[i] * b[i]);
        }

        System.out.println(result);
    }
}
