package objects.Shapes;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Circle extends Shape {
    private int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }
}
