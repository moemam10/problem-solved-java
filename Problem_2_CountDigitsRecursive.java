
import java.util.Scanner;

public class Problem_2_CountDigitsRecursive {
    static int c = 0;

    public static void count(int n) {
        if (n == 0) {
            System.out.println(c);
        } else {
            c++;
            count(n / 10);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        count(n);
    }
}
