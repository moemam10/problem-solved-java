
import java.util.Scanner;

public class Problem_4_ReverseDigitsRecursive {
    static int rev = 0;

    public static void reverse(int n) {
        if (n == 0) {
            System.out.println(rev);
        } else {
            int x = n % 10;
            rev += x;
            if (n > 10) {
                rev *= 10;
            }
            reverse(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        reverse(n);
    }
}
