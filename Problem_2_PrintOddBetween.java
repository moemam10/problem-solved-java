import java.util.Scanner;

public class Problem_2_PrintOddBetween {
    public static void sum(int n, int x) {
        for (int i = n; i <= x; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        int x, n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        x = input.nextInt();
        sum(n, x);
    }
}