
public class Problem_4_ArmstrongNumbers {
    public static void main(String[] args) {
        int mod, num, count, sum;
        for (int j = 1; j <= 500; j++) {
            num = j;
            count = 0;
            sum = 0;
            while (num > 0) {
                num = num / 10;
                ++count;
            }
            num = j;
            for (int i = 0; i < count; i++) {
                mod = num % 10;
                sum += Math.pow(mod, count);
                num /= 10;
            }
            if (sum == j) {
                System.out.println(sum);
            }
        }
    }
}
