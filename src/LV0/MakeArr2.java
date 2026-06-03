// 문제: 배열 만들기 2
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181921
// 날짜: 2026-06-04

package LV0;
import java.util.*;
public class MakeArr2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int r = sc.nextInt();

        int count = 0;

        for(int i = l; i <= r; i++){
            String temp = Integer.toString(i);
            boolean check = true;

            for(int j = 0; j < temp.length(); j++){
                if(temp.charAt(j) != '0' && temp.charAt(j) != '5'){
                    check = false;
                    break;
                }
            }

            if(check){
                count++;
            }
        }

        int [] result = new int[count];

        if(count == 0){
            result = new int[]{-1};
        }

        int index = 0;

        for(int i = l; i <= r; i++){
            String temp = Integer.toString(i);
            boolean check = true;

            for (int j = 0; j < temp.length(); j++) {
                if (temp.charAt(j) != '0' && temp.charAt(j) != '5') {
                    check = false;
                    break;
                }
            }

            if (check) {
                result[index++] = i;
            }
        }

        for(int i = 0; i < index; i++){
            System.out.println(result[i]);
        }
    }
}
