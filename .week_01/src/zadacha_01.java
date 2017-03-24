/**
 * Created by YurievAP on 15.03.2017.
 */
import java.util.Random;

public class zadacha_01 {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        Random rand = new Random();

        int num = rand.nextInt(100);
        String type = num % 2 == 0 ? "Число " +num +" четное" : "Число " +num +" не четное";
        System.out.println(type);
    }
}
