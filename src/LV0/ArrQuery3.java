// 문제: 수열과 구간 쿼리 3
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181924
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class ArrQuery3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[5];
        int [][]query = new int[3][2];

        for(int i = 0; i < 5; i++){
            ar[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 2; k++){
                query[i][k] = sc.nextInt();
            }
        }


        for(int i = 0; i < 3; i++){
            int temp = ar[query[i][0]];
            ar[query[i][0]] = ar[query[i][1]];
            ar[query[i][1]] = temp;
        }

        for(int i = 0 ; i < 5; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
