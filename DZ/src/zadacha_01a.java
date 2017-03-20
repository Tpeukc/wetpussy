import java.util.Random;


/**
 * Created by YurievAP on 14.03.2017.
 */
public class zadacha_01a {
    public static void main (String[] args) {
        Random rand = new Random();

        System.out.println("_________________________________");
        System.out.println("Домашнее задание №1: ");
            int q = rand.nextInt(100);
            int w = rand.nextInt(100);
            int r = q/w;
            int z = q%w;
        System.out.println("Разделив " +q +" на " +w +" , получим " +r +","+z);
        System.out.println("_________________________________");

        System.out.println("Домашнее задание №2: ");
            int a=rand.nextInt(100);
        System.out.print("Сумма цифр числа "+a+" = ");
        System.out.println((a%10)+((a/10)%10));
        System.out.println("_________________________________");

        System.out.println("Домашнее задание №3: ");
            //double v = rand.nextDouble()*100;
        float v = rand.nextFloat()*100;
        int x = (int)(v + 0.5);
        System.out.println("Оклугляем " +v + " в большую сторону" +" ,получаем "+x);
        System.out.println("Оклугляем " +v + " в меньшую сторону" +" ,получаем "+(int)v);
        System.out.println("_________________________________");


        System.out.println("Домашнее задание №4: ");
            int n=rand.nextInt(1000);
        System.out.print("Сумма цифр числа "+n+" = ");
        System.out.println((n%10)+((n/10)%10)+((n/100)%10));
        System.out.println("_________________________________");


        System.out.println("Домашнее задание №5: ");
        //int m = 77;
            int m = rand.nextInt(1000);
        if(m % 2 == 0) {
            System.out.println("Число " + m + " четное");
        }
        else {
            System.out.println("Число " + m + " нечетное");
        }
        System.out.println("_________________________________");


    }
}
