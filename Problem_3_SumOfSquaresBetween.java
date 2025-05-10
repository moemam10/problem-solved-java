import java.util.Scanner;

public class Problem_3_SumOfSquaresBetween {
    public static int sum(int n, int x) {
        int sum = 0;
        for (int i = n; i < x; i++) {
            sum += i * i;
        }
        return sum;
    }

    public static void main(String[] args) {
        int x, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        x = input.nextInt();
        int result = sum(n, x);
        System.out.println(result);
    }
}