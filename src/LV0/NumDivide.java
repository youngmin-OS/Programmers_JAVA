package LV0;
import java.util.*;

public class NumDivide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        while (n > 0) {
            sum += (n % 100);
            n /= 100;
        }

        System.out.println(sum);
    }
}
