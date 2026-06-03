// 문제: 수열과 구간 쿼리 4
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181922
// 날짜: 2026-06-04

package LV0;
import java.util.*;
public class ArrQuery4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[5];
        int [][]query = new int[3][3];

        for(int i = 0; i < 5; i++){
            ar[i] = sc.nextInt();
        }

        for(int i = 0; i < 3; i++){
            for(int k = 0; k < 3; k++){
                query[i][k] = sc.nextInt();
            }
        }

        for(int j = 0; j < 3; j++){
            for(int i = 0; i < 5; i++){
                if(query[j][0] <= i && i <= query[j][1]){
                    if(i % query[j][2] == 0){
                        ar[i]++;
                    }
                }
            }
        }

        for(int i = 0; i < 5; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
