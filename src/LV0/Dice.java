// 문제: 주사위 게임2
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181930
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = 0;
        if(a == b && b == c){
            result = (a + b + c) * (a * a + b * b + c * c) * (a*a*a + b*b*b + c*c*c);
        }

        else if((a == b && a != c) || (a != b && a == c) || (a != b && b == c)){
            result = (a + b + c) * ( a*a + b*b + c*c);
        }

        else{
            result = (a + b+ c);
        }

        System.out.println(result);
    }
}
