
import java.util.Scanner;

public class Problem_5_PrimeRecursive {
    static int i = 2;

    public static boolean prime(int n) {
        if (n % i == 0 || n <= 1) {
            return false;
        } else if (i == n - 1) {
            return true;
        } else {
            i++;
            return prime(n);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(prime(n));
    }
}
