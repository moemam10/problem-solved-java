
import java.util.Scanner;

public class Problem_5_Fibonacci {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int first = 0, second = 1, third;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= x; i++) {
            third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
    }
}
