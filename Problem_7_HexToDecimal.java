
import java.util.Scanner;

public class Problem_7_HexToDecimal {
    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        x = input.nextLine();
        int n, sum = 0;
        int base = 1;
        for (int i = x.length() - 1; i >= 0; i--) {
            n = x.charAt(i);
            if (n >= 48 && n <= 57) {
                n = n - 48;
            } else if (n >= 97 && n <= 102) {
                n = n - 87;
            }
            sum += n * base;
            base *= 16;
        }
        System.out.println("the decimal is " + sum);
    }
}
