/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_22 { //Создайте массив из всех нечётных чисел от 1 до 99

    public static void main(String[] args){
        int a=0; //а хранит значения цикла для массива
        for(int i=1;i<=99;i++){  //цикл от 1 до 99ти, шаг +1
            if(i%2!=0)a++; //проверка каждого числа. если остаток неравен нулю, то добавляем значение в массив
        }
        //Создадим массив, и используя цикл, заполним его ячейки. Сразу выведем на экран значения элементов массива в строку
        int[] Mas = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        //Выведем на экран каждый элемент массива на отдельной строке в обратном порядке
        System.out.println(" ");
        for(int i=Mas.length-1;i>=0;i--){
            System.out.println(Mas[i]);
        }
    }
}
