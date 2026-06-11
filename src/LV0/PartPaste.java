// 문제: 부분 문자열 이어 붙여 문자열 만들기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181911
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class PartPaste{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []str = new String[4];
        for(int i = 0; i < str.length; i++){
            str[i] = sc.nextLine();
        }
        int [][] ar = new int[4][2];

        for(int i = 0; i < ar.length; i++){
            ar[i][0] = sc.nextInt();
            ar[i][1] = sc.nextInt();
        }

        int s = 0;
        int e = 0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length; i++){
            s = ar[i][0];
            e = ar[i][1];

            for(int k = s; k <= e; k++){
                sb.append(str[i].charAt(k));
            }

            System.out.println(sb.toString());
        }
    }
}
