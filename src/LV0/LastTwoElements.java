// 문제: 마지막 두 원소
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181927
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class LastTwoElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int []ar = new int[6];

        for(int i = 0; i < n; i++){
            ar[i] = sc.nextInt();
        }

        int e = 0;
        if(ar[n - 1] > ar[n - 2]){
            e = ar[n - 1] - ar[n - 2];
        }

        else{
            e = ar[n - 1] * 2;
        }

        int size = n + 1;
        ar[ar.length - 1] = e;

        for(int i = 0; i < size; i++){
            System.out.print(ar[i] + " ");
        }
    }
}
