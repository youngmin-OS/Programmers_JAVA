// 문제: 콜라츠 수열 만들기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181919
// 날짜: 2026-06-04

package LV0;
import java.util.*;
public class CollatsArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int temp = n;
        int count = 1;
        while(temp > 1){
            if(temp % 2 == 0){
                temp /= 2;
            }

            else{
                temp = temp * 3 + 1;
            }
            count++;
        }

        int []result = new int[count];

        int index = 0;
        temp = n;
        result[0] = temp;

        while(temp > 1){
            if(temp % 2 == 0){
                temp /= 2;
            }
            else{
                temp = temp * 3 + 1;
            }
            result[++index] = temp;
        }

        for(int i = 0; i < count; i++){
            System.out.println(result[i]);
        }
    }
}
