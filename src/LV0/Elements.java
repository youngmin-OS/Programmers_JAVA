// 문제: 원소들의 곱과 합
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181929
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];

        for(int i = 0; i < 5; i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int result = 1;
        for(int i = 0; i < 5; i++){
            result *= arr[i];
            sum += arr[i];
        }

        sum = (sum * sum);

        if(sum < result){
            result = 0;
        }

        else{
            result = 1;
        }

        System.out.println(result);
    }
}
