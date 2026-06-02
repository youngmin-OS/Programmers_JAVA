// 문제: 더 크게 합치기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181939
// 날짜: 2026-06-02

package LV0;
import java.util.*;

public class TheLarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String temp1 = "";
        String temp2 = "";

        temp1 += a;
        temp1 += b;

        temp2 += b;
        temp2 += a;

        String max = "";

        if(Integer.parseInt(temp1) > Integer.parseInt(temp2)){
            max = temp1;
        }

        else{
            max = temp2;
        }
        System.out.println(max);

    }
}
