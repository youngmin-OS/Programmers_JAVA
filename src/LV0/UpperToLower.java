// 문제: 대문자 소문자로 변환
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181938
// 날짜: 2026-05-29

package LV0;
import java.util.*;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for(char s : a.toCharArray()){
            if('a' <= s && s <= 'z'){
                s = (char)(s - 32);
            }
            else{
                s = (char)(s + 32);
            }

            System.out.print(s);
        }
    }
}
