// 문제: 간단한 논리 연산
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181917
// 날짜: 2026-06-09

package LV0;
import java.util.*;
public class BasicBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean x1 = sc.hasNextBoolean();
        boolean x2 = sc.hasNextBoolean();
        boolean x3 = sc.hasNextBoolean();
        boolean x4 = sc.hasNextBoolean();

        boolean result1 = true;
        boolean result2 = true;
        if(x1 == false){
            if(x2 == false){
                result1 = false;
            }
        }

        if(x3 == false){
            if(x4 == false){
                result2 = false;
            }
        }

        boolean result = true;

        if(result1 == true){
            if(result2 == false){
                result = false;
            }
        }
        else{
            result = false;
        }

        System.out.println(result);
    }
}
