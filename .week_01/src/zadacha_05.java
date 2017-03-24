/**
 * Created by YurievAP on 17.03.2017.
 */
import  java.util.Random;
public class zadacha_05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(1000);
        int b = (a / 100) % 10;
        int c = (a / 10) % 10;
        int d = a % 10;

        if (b >= c & b > d || b > c & b >= d) {
            System.out.println("В числе " + a + " наибольшая цифра " + b);
        } else {
            if (c > b & c >= d) {
                System.out.println("В числе " + a + " наибольшая цифра " + c);
            } else {
                System.out.println("В числе " + a + " наибольшая цифра " + d);
            }

        }
    }
}


