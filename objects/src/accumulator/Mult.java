package accumulator;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Mult extends Operation {

    @Override
    public int apply(int a, int b) {
        return a * b;
    }

    @Override
    public double apply(double a, double b) {
        return a * b;
    }

    @Override
    public long apply(long a, long b) {
        return a * b;
    }
}