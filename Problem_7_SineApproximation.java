import java.util.Scanner;

public class Problem_7_SineApproximation {
    public static void e(float x) {
        float sum = x;
        double pow = x;
        double fact = 1;
        int sign = -1;
        for (int i = 3; i < 15; i += 2) {
            pow *= x * x;
            fact *= i * (i - 1);
            sum += sign * (pow / fact);
            sign *= -1;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        float x;
        Scanner input = new Scanner(System.in);
        x = input.nextFloat();
        e(x);
    }
}