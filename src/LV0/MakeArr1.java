// 문제: 배열 만들기 1
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181901
// 날짜: 2026-06-13

package LV0;
import java.util.*;
public class MakeArr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int [] result = new int[n/k];
        int count = 0;

        int temp = k;
        while(temp <= n){
            result[count++] = temp;
            temp += k;
        }

        for(int i = 0; i < count; i++){
            System.out.println(result[i]);
        }
    }
}
