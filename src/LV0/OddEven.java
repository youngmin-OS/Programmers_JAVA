// 문제: 홀짝에 따라 다른 값 반환하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181935
// 날짜: 2026-06-01

package LV0;
import java.util.*;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        if (n % 2 == 1) {
            sum = 0;
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
        }

        else{
            sum = 0;
            for(int i = 1; i <= n; i++){
                if(i % 2 == 0){
                    sum += (i * i);
                }
            }
        }

        System.out.println(sum);
    }
}
