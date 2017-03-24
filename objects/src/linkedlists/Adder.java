package linkedlists;

/**
 * Created by YurievAP on 24.03.2017.
 */
public class Adder {
    int x;

    Adder(int value) {
        x = value;
    }

    public void increment() {
        x++;
    }

    public void add(int value) {
        x += value;
    }

    public int getValue() {
        return x;
    }

}
