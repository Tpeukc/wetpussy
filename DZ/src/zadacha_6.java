/**
 * Created by Sola on 16.03.2017.
 */
import java.util.*;
public class zadacha_6 {


        public static void main(String[] args){
            Random rnd=new Random();
            int a= rnd.nextInt(28800), b=a/60/60;
            System.out.println("Секунд осталось "+a);
            switch(b){
                case 0:
                    System.out.println("До конца рабочего дня осталось меньше часа");
                    break;
                case 1:
                    System.out.println("До конца рабочего дня остался "+b+" час");
                    break;
                case 2:
                case 3:
                case 4:
                    System.out.println("До конца рабочего дня осталось "+b+" часа");
                    break;
                default:
                    System.out.println("До конца рабочего дня осталось "+b+ " часов");
            }
        }
    }

