/**
 * Created by Sola on 19.03.2017.
 */

import java.util.Random;
public class zadacha_23 { //Создайте массив из 15 случайных целых чисел из отрезка [0;9].

    public static void main(String[] args){

        int b=0; // задаем переменную, хранящую количество четных значений
        int[] Mas = new int[15]; //создаем массив на 15
        for(int i=0;i<Mas.length;i++){  // цикл на длинну массива с шагом 1
            Random rnd=new Random(); // создаем переменную рандом
            Mas[i]=rnd.nextInt(10); //рандомное число не более 9
            System.out.print(Mas[i] +" "); //выводим массив
            if(Mas[i]>0&Mas[i]%2==0)b++; ///считаем количество четных элементов
        }
        System.out.println(" "); //выравнивание
        System.out.println("Всего в массиве "+b+" четных"); //выводим кол-во четных чисел
    }


}
