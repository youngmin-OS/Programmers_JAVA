package LV0;
import java.util.*;

public class MixTwoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a1 = sc.nextLine();
        String a2 = sc.nextLine();

        StringBuilder result = new StringBuilder();
        int idx = 0;

        while(idx < a1.length()){
            result.append(a1.charAt(idx));
            result.append(a2.charAt(idx));
            idx++;
        }

        System.out.println(result);
    }
}
