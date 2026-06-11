// 문제: 문자열 여러 번 뒤집기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181913
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class StringFlip{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int [][]ar = new int[4][2];
        for(int i = 0; i < ar.length; i++){
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();

            int s = ar[i][0];
            int e = ar[i][1];

            StringBuilder sb = new StringBuilder(str);
            for(int j = s; j <= e; j++){
                sb.setCharAt(j,str.charAt(e));
                sb.setCharAt(e, str.charAt(j));
                e--;
                str = sb.toString();
            }

            System.out.println(str);
        }
    }
}
