// 문제: 수 조작하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181926
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class FixNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String control = sc.nextLine();

        for(char a : control.toCharArray()){
            if(a == 'w'){
                n++;
            }

            else if(a == 's'){
                n--;
            }

            else if(a == 'd'){
                n += 10;
            }

            else if(a == 'a'){
                n -= 10;
            }
        }

        System.out.println(n);
    }
}
