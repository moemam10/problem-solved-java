
import java.util.Scanner;

public class Problem_6_SecondMaxInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), max = 0, secmax = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(arr[i] > secmax && arr[i] < max){
                secmax = arr[i];
            }
        }
        System.out.println(secmax);
    }
}
