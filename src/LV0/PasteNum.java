// 문제: 이어 붙인 수
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181928
// 날짜: 2026-06-03

package LV0;
import java.util.*;
public class PasteNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int [] ar = new int[n];

        for(int i = 0; i < ar.length; i++){
            ar[i] = sc.nextInt();
        }

        String strOdd = new String();
        String strEven = new String();

        for(int i = 0; i < 5; i++){
            if(ar[i] % 2 == 1){
                strOdd += String.valueOf(ar[i]);
            }

            else{
                strEven += String.valueOf(ar[i]);
            }
        }

        int result = Integer.parseInt(strOdd) + Integer.parseInt(strEven);
        System.out.println(result);
    }
}
