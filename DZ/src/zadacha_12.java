/**
 * Created by YurievAP on 17.03.2017.
 */
import java.util.Scanner;

public class zadacha_12 {
    public static void main(String[] args){
        int a;
        long b=1;

        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");


        if(scn.hasNextInt()){
            a=scn.nextInt();
            //факториал - произведение всех чисел до заданного числа
            for(int i=a;i>0;i--){
            //эта херня перемножит все числа в переменной i
                b*=i;

            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введено не число");

    }
}