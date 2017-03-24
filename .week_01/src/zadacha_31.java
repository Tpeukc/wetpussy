/**
 * Created by Sola on 19.03.2017.
 */

import java.util.Scanner;
public class zadacha_31 {
    public static void main(String[] args){
        //Создадим переменную, в которую занесем число, введенное пользователем
        // Также создадим переменные, в которых будут храниться значения суммы модулей чисел в массиве
        int a,lCount=0,rCount=0;
        //Создадим объект класса Scanner
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите четное число");
        //Проверим, является ли символ, введенный пользователем, числом
        if (scn.hasNextInt()){
            //Если введено число, проверим является ли число четным, если нет - попросим повторить ввод
            do{
                a=scn.nextInt();
                if(a%2!=0||a<1)System.out.println("Вы ошиблись, введите повторно четное число!");
            }
            while(a%2!=0||a<1);
            //Создадим и заполним массив
            int[] Mas = new int[a];
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*11)-5;
                System.out.print(Mas[i]+" ");
                //В этом же цикле посчитаем сумму модулей чисел половин массива
                if(i<=Mas.length/2-1){
                    lCount+=Math.abs(Mas[i]);
                }
                else {
                    rCount+=Math.abs(Mas[i]);
                }
                //На последнем витке цикла проверим, какая из сум больше и выведем об этом сообщение
                if(i==Mas.length-1){
                    System.out.println(" ");
                    if(lCount>rCount)
                        System.out.println("Сумма модулей первой половины массива больше и равна "+lCount);
                    if(rCount>lCount)
                        System.out.println("Сумма модулей второй половины массива больше и равна "+rCount);
                    if(rCount==lCount)
                        System.out.println("Суммы модулей первой и второй половины равны");
                }
            }
        }
        else System.out.println("Введено не число");
    }

}
