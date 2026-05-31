// 문제: 숫자 나누고 더하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181938
// 날짜: 2026-05-29

package LV0;
import java.util.*;

public class NumDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += (n % 100);
            n /= 100;
        }

        System.out.println(sum);
    }
}
