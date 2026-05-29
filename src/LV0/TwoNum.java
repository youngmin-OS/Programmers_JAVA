// 문제: 두 수의 연산값 비교하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181938
// 날짜: 2026-05-29

package LV0;
import java.util.*;

public class TwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int num1 = Integer.parseInt("" + a + b);
        int num2 = 2 * a * b;

        int result = Math.max(num1, num2);

        System.out.println(result);
    }
}
