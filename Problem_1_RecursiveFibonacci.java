
import java.util.Scanner;

public class Problem_1_RecursiveFibonacci {
    public static int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("fib is " + fib(n));
    }
}
