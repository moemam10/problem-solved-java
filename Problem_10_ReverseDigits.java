
import java.util.Scanner;

public class Problem_10_ReverseDigits {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int mod, n = 0;
        while (x != 0) {
            mod = x % 10;
            n += mod;
            if (x >= 10) {
                n *= 10;
            }
            x /= 10;
        }
        System.out.println(n);
    }
}
