
import java.util.Scanner;

public class Problem_8_PascalsTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int spaces = n;
        int num = 1;
        for (int i = 0; i < n; i++) {
            for (int s = 1; s <= spaces; s++) {
                System.out.print(" ");
            }
            num = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num * (i - j) / (j + 1);
            }
            spaces--;
            System.out.println();
        }
    }
}
