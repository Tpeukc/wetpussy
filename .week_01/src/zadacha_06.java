/**
 * Created by YurievAP on 17.03.2017.
 */
import  java.util.Random;
public class zadacha_06 {

    public static void main(String args []){
        Random rand = new Random();
        int a = rand.nextInt(100)*-1;
        int b = rand.nextInt(100);
        int c = rand.nextInt(100);
        int x;
        System.out.println("Числа в переменных a, b и c : " + a  + " " + b + " " + c);
        if (a > b) {
            x = a; a = b; b = x;}
        if (b > c){
            x = b; b = c; c = x;
        }
        System.out.println("Возрастающая последовательность: " + a  + " " + b + " " + c);
    }
}
