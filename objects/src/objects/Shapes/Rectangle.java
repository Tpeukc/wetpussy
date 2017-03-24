package objects.Shapes;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Rectangle extends Shape{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
