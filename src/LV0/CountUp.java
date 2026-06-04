// 문제: 카운트 업
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181920
// 날짜: 2026-06-04

package LV0;
import java.util.*;
public class CountUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();

        int [] result = new int[e - s + 1];
        int index = 0;
        for(int i = s; i <= e; i++){
            result[index++] = i;
        }

        for(int i = 0; i < e - s + 1; i++){
            System.out.println(result[i]);
        }
    }
}
