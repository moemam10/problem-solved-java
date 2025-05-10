import java.util.Scanner;

public class Problem_11_ReverseNumber {
    public static void reverse(int r) {
        int mod = 0, n = 0;
        while (r != 0) {
            mod = r % 10;
            n += mod;
            if (r > 10) {
                n *= 10;
            }
            r /= 10;
        }
        System.out.println(n);
    }

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        reverse(x);
    }
}