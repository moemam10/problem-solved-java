import java.util.Scanner;

public class Problem_10_HexToOctal {
    public static void hextooct(String s) {
        int n, sum = 0;
        int base = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            n = s.charAt(i);
            if (n >= 48 && n <= 57) {
                n = n - 48;
            } else if (n >= 97 && n <= 102) {
                n = n - 87;
            }
            sum += n * base;
            base *= 16;
        }
        int base2 = 1, bin = 0, mod;
        while (sum != 0) {
            mod = sum % 8;
            bin += mod * base2;
            sum /= 8;
            base2 *= 10;
        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        x = input.nextLine();
        hextooct(x);
    }
}