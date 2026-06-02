// 문제: flag에 따라 다른 값 반환하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181933
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class FlagReturn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        boolean flag = sc.hasNextBoolean();
        int result = 0;
        if(flag){
            result = (a + b);
        }

        else{
            result = (a - b);
        }

        System.out.println(result);
    }
}
