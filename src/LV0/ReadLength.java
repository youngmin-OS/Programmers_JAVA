// 문제: 세로 읽기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181904
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class ReadLength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int m = sc.nextInt();
        int c = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        int [] temp = new int[s.length() / m];
        int count = 0;
        for(int i = 0; i < s.length(); i+=m){

            temp[count++] = (i + c) - 1;
        }

        for(int i = 0; i < count; i++){
            sb.append(s.charAt(temp[i]));
        }

        System.out.println(sb.toString());
    }
}
