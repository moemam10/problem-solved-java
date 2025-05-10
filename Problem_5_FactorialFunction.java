import java.util.Scanner;

public class Problem_5_FactorialFunction {
    public static int fact(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int result = fact(x);
        System.out.println(result);
    }
}