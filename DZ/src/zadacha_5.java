/**
 * Created by Sola on 16.03.2017.
 */
public class zadacha_5 {

    public static void main(String[] args) {
        int a = 7, b = 0, c = -5;
        System.out.println("Числа в переменных a, b и c: " + a + " " + b + " " + c);
        if (a < b & a < c) {
            if (b < c) System.out.println("Возрастающая последовательность " + a + " " + b + " " + c);
            else System.out.println("Возрастающая последовательность " + a + " " + c + " " + b);
        }
        if (b < a & b < c) {
            if (a < c) System.out.println("Возрастающая последовательность " + b + " " + a + " " + c);
            else System.out.println("Возрастающая последовательность " + b + " " + c + " " + a);
        }
        if (c < a & c < b) {
            if (a < b) System.out.println("Возрастающая последовательность " + c + " " + a + " " + b);
            else System.out.println("Возрастающая последовательность " + c + " " + b + " " + a);
        }
    }
}
