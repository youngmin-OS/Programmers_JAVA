// 문제: 짝수는 싫어요
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/120813
// 날짜: 2026-06-09

package LV0;
import java.util.*;
public class HateEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 0;
        if(n % 2 == 0){
            size = n / 2;
        }

        else{
            size = n / 2 + 1;
        }

        int [] ar = new int[size];
        int index = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 1){
                ar[index++] = i;
            }
        }

        for(int i = 0; i < size - 1; i++){
            for(int j = i; j < size; j++){
                if(ar[i] > ar[j]){
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }

        for(int i = 0; i < size; i++){
            System.out.print(ar[i]);
        }
    }
}
