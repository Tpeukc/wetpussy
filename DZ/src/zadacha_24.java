/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_24 { //Создайте массив из 8 случайных целых чисел из отрезка [1;10]
    public static void main(String[] args){
        int[] Mas = new int[8]; //создаем массив на 8 чисел
        for(int i=0;i<Mas.length;i++){ // цикл на длинну массива (8) с шагом 1
            Mas[i]=(int)(Math.random()*9+1); //массив из отрезка 1;10
            System.out.print(Mas[i] +" "); //вывод результатов по горизонтали
        }
        for(int i=0;i<Mas.length;i++){ // цикл на длинну массива (8) с шагом 1
            if(Mas[i]%2!=0)Mas[i]=0; //замена нечетного числа на ноль
            System.out.println(Mas[i] +""); //вывод результатов по вертикали
        }
    }
}
