
import java.util.Scanner;

public class Problem_3_IsPrime {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        boolean check = true;
        if (x == 0 || x == 1) {
            check = false;
        } else {
            for (int i = 2; i < x; i++) {
                if (x % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check) {
            System.out.println("yes prime");
        } else {
            System.out.println("not prime");
        }
    }
}
