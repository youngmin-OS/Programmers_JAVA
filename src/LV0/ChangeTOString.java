// 문제: 문자 리스트를 문자열로 변환하기
// URL: https://school.programmers.co.kr/learn/courses/30/lessons/181941
// 날짜: 2026-06-02

package LV0;
import java.util.*;

class ChangeTOString {
    public String solution(String[] arr) {
        String result = new String();

        for(int i = 0; i < arr.length; i++){
            result += arr[i];
        }

        return result;
    }
}