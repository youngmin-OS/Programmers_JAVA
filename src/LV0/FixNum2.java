// 문제: 수 조작하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181926
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class FixNum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] ar = new int[12];

        for(int i = 0; i < 12; i++){
            ar[i] = sc.nextInt();
        }
        StringBuilder result = new StringBuilder();

        for(int i = 1; i < 12; i++){
            if(ar[i] - ar[i - 1] == 1){
                result.append('w');
            }

            else if(ar[i] - ar[i - 1] == 10){
                result.append('d');
            }

            else if(ar[i] - ar[i - 1] == -1){
                result.append('s');
            }

            else if(ar[i] - ar[i - 1] == -10){
                result.append('a');
            }
        }

        System.out.println(result);
    }
}
