// 문제: 등차수열의 특정한 항만 더하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181931
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class ArithmeticSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();

        boolean [] included = new boolean[n];
        for(int i = 0; i < included.length; i++){
            included[i] = sc.nextBoolean();
        }

        int [] arr = new int[n];
        arr[0] = a;

        for(int i = 1; i < n; i++){
            arr[i] = arr[i - 1];
            arr[i] += d;
        }
        int result = 0;
        for(int i = 0; i < n; i++){
            if(included[i]){
                result += arr[i];
            }
        }

        System.out.println(result);
    }
}
