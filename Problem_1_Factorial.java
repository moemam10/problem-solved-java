
import java.util.Scanner;

public class Problem_1_Factorial {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }
}
