import java.util.Scanner;

public class Problem_4_PowerFunction {
    public static int pow(int x, int y) {
        int pow = 1;
        for (int i = 0; i < y; i++) {
            pow *= x;
        }
        return pow;
    }

    public static void main(String[] args) {
        int x, y;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        y = input.nextInt();
        int result = pow(x, y);
        System.out.println(result);
    }
}