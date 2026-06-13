// 문제: 홀수 vs 짝수
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181887
// 날짜: 2026-06-13

package LV0;
import java.util.*;
public class EvenOrOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[6];

        for(int i = 0 ; i < 6; i++){
            ar[i] = sc.nextInt();
        }

        int odd = 0;
        int even = 0;

        for(int i = 0; i < 6; i++){
            if(i % 2 == 1){
                odd += ar[i];
            }

            else{
                even += ar[i];
            }
        }
        int result = 0;

        if(odd < even){
            result = even;
        }

        else{
            result = odd;
        }

        System.out.println(even + " " +odd);
        System.out.println(result);
    }
}
