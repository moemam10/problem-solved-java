
import java.util.ArrayList;
import java.util.Scanner;

public class Problem_7_ArrayToArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] array = {"MOhamed", "19", "Fci", "Assiut Uni"};
        ArrayList<String> arrayList = new ArrayList<>();
        for (String element : array) {
            arrayList.add(element);
        }
        System.out.println("ArrayList: " + arrayList);
    }
}
