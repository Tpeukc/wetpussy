/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_32 {
    public static void main(String[] args){
        //Создадим переменные, в которые будем сохранять количество положительных и отрицательных елементов массива
        int a=0,b=0;
        int[] Mas = new int[12];
        //При помощи оператора do-while будем при помощи цикла заполнять массив то тих пор, пока значение положительных и отрицательных элементов массива будет равно
        do{
            for(int i=0;i<Mas.length;i++){
                Mas[i]=(int)(Math.random()*21)-10;
                //Увеличим значения счетчиков, в зависимости от зачения элемента массива
                if(Mas[i]<0){
                    a++;
                }
                if(Mas[i]>0){
                    b++;
                }
                //Проверим не равно ли значение массива 0, если равно заполним значение заново
                if(Mas[i]==0){
                    --i;
                }
                //Проверим, поровну ли в конце цикла положительных и отрицательных элементов среди жлементов массива. Если нет - обнулим счетчики
                if(i==Mas.length-1&a!=Mas.length/2){
                    a=0;
                    b=0;
                }
            }
        }
        while (a!=Mas.length/2&b!=Mas.length/2);
        //С помощью цикла выведем значения массива на экран
        for(int i=0;i<Mas.length;i++){
            System.out.print(Mas[i]+" ");
        }
    }
}