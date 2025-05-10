import java.util.Scanner;

public class Problem_1_SumFromZeroToN {
    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        int result = sum(x);
        System.out.println(result);
    }
}