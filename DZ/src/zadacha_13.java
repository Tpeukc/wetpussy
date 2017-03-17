/**
 * Created by YurievAP on 17.03.2017.
 */
import  java.util.*;
public class zadacha_13{
    public static void main(String[] args){
        int a;
        Scanner scn=new Scanner(System.in);
        System.out.println("Введите натуральное число");

        if(scn.hasNextInt()){

            a=scn.nextInt();

            System.out.print("Делителями числа "+a+" являются ");
            for(int i=a;i>0;i--){
                int b=a%i;
                if(b==0)
                    System.out.print(i+" ");
            }
        }
        else System.out.println("Ошибка. Введено не число");

    }
}