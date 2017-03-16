/**
 * Created by Sola on 16.03.2017.
 */
import java.util.Scanner;
public class zadacha_11{
    public static void main(String[] args){

        int a;

        long b=1;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");

        if(scn.hasNextInt()){
                    a=scn.nextInt();

            for(int i=a;i>0;i--){
                b*=i;
            }
            System.out.println("Факториал числа "+a+" равен "+b);
        }
        else System.out.println("Ошибка. Введено не число");

    }
}
