
import java.util.Scanner;

public class Problem_1_RecursiveFibonacciPrint {
    static int n = 0, n2 = 1, n3;

    public static void fib(int x) {
        if (x > 0) {
            n3 = n + n2;
            n = n2;
            n2 = n3;
            System.out.print(" " + n3);
            fib(x - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.print(n + " " + n2);
        fib(x - 2);
    }
}
