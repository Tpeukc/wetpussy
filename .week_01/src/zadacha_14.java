/**
 * Created by YurievAP on 17.03.2017.
 */
import java.util.*;

public class zadacha_14 {
    public static void main(String[] args) {
        int a;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите натуарльное число");

        if(scn.hasNextInt()) {
            a = scn.nextInt();
            for (int i = (int) Math.sqrt(a); i >= 1; i--) {
                if (a % i == 0 & i != 1) {
                    System.out.println("Заданое число - составное");
                    break;
                }
                if (i == 1) System.out.println("Заданое число простое");
            }
        }
        else System.out.println("Еще раз. Это не число.");

        }
    }

