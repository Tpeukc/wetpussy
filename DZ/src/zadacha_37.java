/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_37 {
    public static void main(String[] args){
        //Создадим массив
        int [][] Mas = new int[6][7];
        //Заполним массив
        for(int i =0;i<Mas.length;i++){
            //Индекс строки для удобства восприятия
            System.out.print("Строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)(Math.random()*10);
                //Выведем на экран элементы строки
                System.out.print(Mas[i][h]+" ");
                //Создадим две переменные, в которых будет храниться значение максимального элемента строки массива и его индекс
                int max=0,temp_index=0;;
                //Сохраним значение первого элемента в переменную, с которой будем сравнивать остальные значения элементов. Если значение переменной меньше, переменная получает новое значение, индекс элемента в строке сохраняется во вторую переменную
                if(h==0)max=Mas[i][h];
                else {
                    if(max<Mas[i][h]){
                        max=Mas[i][h];
                        temp_index=h;
                    }
                }
                //По достижению конца строки, меняем местами первый и максимальный элемент, если они отличаются
                if(h==Mas[i].length-1){
                    int temp = Mas[i][0];
                    Mas[i][0]=Mas[i][temp_index];
                    Mas[i][temp_index]=temp;
                }
            }
            System.out.println(" ");
        }
        //Выводим обработанный массив на экран
        for(int i =0;i<Mas.length;i++){
            System.out.print("Обработанная строка №"+i+" ");
            for(int h=0;h<Mas[i].length;h++){
                System.out.print(Mas[i][h]+" ");
            }
            System.out.println(" ");
        }
    }
}

