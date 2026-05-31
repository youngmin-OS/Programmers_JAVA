// 문제: n의 배수
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181937
// 날짜: 2026-06-01

package LV0;
import java.util.*;

public class NumAndN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();

        int result = 0;
        if(num % n == 0){
            result = 1;
        }

        System.out.println(result);
    }
}
