// 문제: 문자 개수 세기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181902?language=java
// 날짜: 2026-06-29

package LV0;
import java.util.*;
public class CountStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] count = new int[52];

        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == 'A'){
                count[0] ++;
            }

            else if(s.charAt(i) == 'B'){
                count[1] ++;
            }

            else if(s.charAt(i) == 'C'){
                count[2] ++;
            }

            else if(s.charAt(i) == 'D'){
                count[3] ++;
            }

            else if(s.charAt(i) == 'E'){
                count[4] ++;
            }

            else if(s.charAt(i) == 'F'){
                count[5] ++;
            }

            else if(s.charAt(i) == 'G'){
                count[6] ++;
            }

            else if(s.charAt(i) == 'H'){
                count[7] ++;
            }

            else if(s.charAt(i) == 'I'){
                count[8] ++;
            }

            else if(s.charAt(i) == 'J'){
                count[9] ++;
            }

            else if(s.charAt(i) == 'K'){
                count[10] ++;
            }

            else if(s.charAt(i) == 'L'){
                count[11] ++;
            }

            else if(s.charAt(i) == 'M'){
                count[12] ++;
            }

            else if(s.charAt(i) == 'N'){
                count[13] ++;
            }

            else if(s.charAt(i) == 'O'){
                count[14] ++;
            }

            else if(s.charAt(i) == 'P'){
                count[15] ++;
            }

            else if(s.charAt(i) == 'Q'){
                count[16] ++;
            }

            else if(s.charAt(i) == 'R'){
                count[17] ++;
            }

            else if(s.charAt(i) == 'S'){
                count[18] ++;
            }

            else if(s.charAt(i) == 'T'){
                count[19] ++;
            }

            else if(s.charAt(i) == 'U'){
                count[20] ++;
            }

            else if(s.charAt(i) == 'V'){
                count[21] ++;
            }

            else if(s.charAt(i) == 'W'){
                count[22] ++;
            }

            else if(s.charAt(i) == 'X'){
                count[23] ++;
            }

            else if(s.charAt(i) == 'Y'){
                count[24] ++;
            }

            else if(s.charAt(i) == 'Z'){
                count[25] ++;
            }

            else if(s.charAt(i) == 'a'){
                count[26] ++;
            }

            else if(s.charAt(i) == 'b'){
                count[27] ++;
            }

            else if(s.charAt(i) == 'c'){
                count[28] ++;
            }

            else if(s.charAt(i) == 'd'){
                count[29] ++;
            }

            else if(s.charAt(i) == 'e'){
                count[30] ++;
            }

            else if(s.charAt(i) == 'f'){
                count[31] ++;
            }

            else if(s.charAt(i) == 'g'){
                count[32] ++;
            }

            else if(s.charAt(i) == 'h'){
                count[33] ++;
            }

            else if(s.charAt(i) == 'i'){
                count[34] ++;
            }

            else if(s.charAt(i) == 'j'){
                count[35] ++;
            }

            else if(s.charAt(i) == 'k'){
                count[36] ++;
            }

            else if(s.charAt(i) == 'l'){
                count[37] ++;
            }

            else if(s.charAt(i) == 'm'){
                count[38] ++;
            }

            else if(s.charAt(i) == 'n'){
                count[39] ++;
            }

            else if(s.charAt(i) == 'o'){
                count[40] ++;
            }

            else if(s.charAt(i) == 'p'){
                count[41] ++;
            }

            else if(s.charAt(i) == 'q'){
                count[42] ++;
            }

            else if(s.charAt(i) == 'r'){
                count[43] ++;
            }

            else if(s.charAt(i) == 's'){
                count[44] ++;
            }

            else if(s.charAt(i) == 't'){
                count[45] ++;
            }

            else if(s.charAt(i) == 'u'){
                count[46] ++;
            }

            else if(s.charAt(i) == 'v'){
                count[47] ++;
            }

            else if(s.charAt(i) == 'w'){
                count[48] ++;
            }

            else if(s.charAt(i) == 'x'){
                count[49] ++;
            }

            else if(s.charAt(i) == 'y'){
                count[50] ++;
            }

            else if(s.charAt(i) == 'z'){
                count[51] ++;
            }
        }

        for(int i = 0; i < count.length; i++){
            System.out.println(count[i]);
        }
    }
}
