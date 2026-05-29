package LV0;
import java.util.*;

public class UpperToLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        for(char s : a.toCharArray()){
            if('a' <= s && s <= 'z'){
                s = (char)(s - 32);
            }
            else{
                s = (char)(s + 32);
            }

            System.out.print(s);
        }
    }
}
