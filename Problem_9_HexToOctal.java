
import java.util.Scanner;

public class Problem_9_HexToOctal {
    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        x = input.nextLine();
        int n, decimal = 0;
        int base = 1;
        for (int i = x.length() - 1; i >= 0; i--) {
            n = x.charAt(i);
            if (n >= 48 && n <= 57) {
                n = n - 48;
            } else if (n >= 97 && n <= 102) {
                n = n - 87;
            }
            decimal += n * base;
            base *= 16;
        }
        int base3 = 1, oct = 0, mod;
        while (decimal != 0) {
            mod = decimal % 8;
            oct += mod * base3;
            decimal /= 8;
            base3 *= 10;
        }
        System.out.println("octal is : " + oct);
    }
}
