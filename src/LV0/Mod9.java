// 문제: 9로 나눈 나머지
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181914
// 날짜: 2026-06-11

package LV0;
import java.util.*;
public class Mod9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();

        int sum = 0;
        for(int i = 0; i < num.length(); i++){
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        int result = sum % 9;
        System.out.println(result);
    }
}
