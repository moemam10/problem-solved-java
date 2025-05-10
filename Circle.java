
public class Circle extends Point {
    protected double r;
    protected Point center;

    public Circle(double r, Point center) {
        this.r = r;
        this.center = center;
    }

    public double getarea(double r) {
        return r * r * Math.PI;
    }

    public double getCirc(double r) {
        return 2 * r * Math.PI;
    }
}
