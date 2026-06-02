// 문제: 조건 문자열
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181934
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class IfString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ineq = sc.nextLine();
        String eq = sc.nextLine();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int result = 0;

        if(ineq.equals(">")){
            if(eq.equals("=")){
                if(n >= m){
                    result = 1;
                }
            }

            else if(eq.equals("!")){
                if(n > m){
                    result = 1;
                }
            }
        }

        else if(ineq.equals("<")){
            if(eq.equals("=")){
                if(n <= m){
                    result = 1;
                }
            }

            else if(eq.equals("!")){
                if(n < m){
                    result = 1;
                }
            }
        }

        System.out.println(result);
    }
}
