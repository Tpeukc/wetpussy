package accumulator;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Accumulator {
    private double value;
    private Operation operation;

    public Accumulator(int value, Operation operation) {
        this.value = value;
        this.operation = operation;
    }

    public int calculate(int a) {
        value = operation.apply(value, a);
        return (int) value;
    }

    public double calculate(double a) {
        value = operation.apply(value, a);
        return value;
    }

    public long calculate(long a) {
        value = operation.apply(value, a);
        return (long) value;
    }

    public double getValue() {
        return value;
    }
}
