import java.util.Scanner;

public class Problem_8_HexToDecimal {
    public static void hextodec(String s) {
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
        System.out.println(sum);
    }

    public static void main(String[] args) {
        String x;
        Scanner input = new Scanner(System.in);
        x = input.nextLine();
        hextodec(x);
    }
}