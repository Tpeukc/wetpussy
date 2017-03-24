/**
 * Created by YurievAP on 17.03.2017.
 */
import java.util.Scanner;
public class zadacha_16 {
    public static void main(String[] args) {
        String a;
        Scanner scn = new Scanner(System.in);
        System.out.println("ВВедите число: ");

        if (scn.hasNextInt()) {
            a = scn.nextLine();

            int c = 0;
            for(int i=0;i<a.length();i++){
                char m = a.charAt(i);
                c = Character.getNumericValue(a.charAt(i)) + c;

            }
            System.out.println("Сумма чисел = " +c);

        } else System.out.println("Введено не число");

    }
}
