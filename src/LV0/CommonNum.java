// 문제: 공배수
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181936
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class CommonNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;
        if(number % n == 0 && number % m == 0){
            result = 1;
        }

        System.out.println(result);
    }
}
