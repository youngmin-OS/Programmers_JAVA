// 문제: 문자열 겹쳐쓰기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181943
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class OverWriteString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String overWrite = sc.nextLine();

        int s = sc.nextInt();

        char[] a = str.toCharArray();
        for(int i = 0; i < overWrite.length(); i++){
            a[i + s] = overWrite.charAt(i);
        }

        String result = String.valueOf(a);
        System.out.println(result);
    }
}
