
import java.util.Scanner;

public class Problem_6_HarmonicSeries {
    public static void main(String[] args) {
        double x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        double sum = 0;
        for (double i = 1; i <= x; i++) {
            sum += 1 / i;
        }
        System.out.println(sum);
    }
}
