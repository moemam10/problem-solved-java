import java.util.Scanner;

public class Problem_6_ExponentialSeries {
    public static void e(int x) {
        float sum = 1;
        double pow = 1;
        double fact = 1;
        for (int i = 1; i < 30; i++) {
            pow *= x;
            fact *= i;
            sum += pow / fact;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        e(x);
    }
}