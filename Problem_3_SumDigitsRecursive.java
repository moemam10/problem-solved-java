
import java.util.Scanner;

public class Problem_3_SumDigitsRecursive {
    static int s = 0;

    public static void sum(int n) {
        if (n == 0) {
            System.out.println(s);
        } else {
            int x = n % 10;
            s += x;
            sum(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sum(n);
    }
}
