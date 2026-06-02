// 문제: 코드 처리하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181932
// 날짜: 2026-06-02

package LV0;
import java.util.*;
public class CodeProcess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();

        String ret = "";
        int mode = 0;
        for(int i = 0; i < code.length(); i++){
            char [] a = code.toCharArray();

            if(mode == 0){
                if(a[i] != '1'){
                    if(i % 2 == 0){
                        ret += a[i];
                    }
                }

                else{
                    mode = 1;
                }
            }

            else if(mode == 1){
                if(a[i] != '1'){
                    if(i % 2 == 1){
                        ret += a[i];
                    }
                }

                else{
                    mode = 0;
                }
            }
        }
        if(ret == ""){
            ret = "EMPTY";
        }

        System.out.println(ret);
    }
}
