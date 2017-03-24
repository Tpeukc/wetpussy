package accumulator;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Pow extends Operation {

    @Override
    public int apply(int a, int b) {
        return (int)Math.pow(a, b);
    }

    @Override
    public double apply(double a, double b) {
        return Math.pow(a, b);
    }

    @Override
    public long apply(long a, long b) {
        return (long) Math.pow(a, b);
    }
}