
import java.util.Scanner;

public class Problem_9_OOPTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Point p = new Point();
        p.setX(5);
        p.setY(10);
        System.out.println("Point coordinates: (" + p.getX() + ", " + p.getY() + ")");

        Circle c = new Circle(7.5, p);
        System.out.println("Circle area: " + c.getarea(7.5));
        System.out.println("Circle circumference: " + c.getCirc(7.5));

        Complex complex = new Complex();
        complex.setReal(3.0);
        complex.setImaginary(4.0);
        System.out.println("Complex number: " + complex.getReal() + " + " + complex.getImaginary() + "i");
    }
}
