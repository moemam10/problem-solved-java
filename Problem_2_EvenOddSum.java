
import java.util.Scanner;

public class Problem_2_EvenOddSum {
    public static void main(String[] args) {
        int x;
        char c;
        int evsum = 0, odsum = 0;
        Scanner input = new Scanner(System.in);
        do {
            x = input.nextInt();
            if (x % 2 == 0) {
                evsum += x;
            } else {
                odsum += x;
            }
            System.out.println("continue?");
            c = input.next().charAt(0);
        } while (c == 'y');
        System.out.println(evsum);
        System.out.println(odsum);
    }
}
