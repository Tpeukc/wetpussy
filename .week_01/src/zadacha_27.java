/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_27 {
    public static void main(String[] args){
        int[] Mas=new int[20];
        //С помощью простого цикла заполним значения елементов массива
        for(int i=0;i<Mas.length;i++){
            //Если индекс элемента массива меньше 2 присваиваем ему значение 1
            if(i<2){
                Mas[i]=1;
            }
            //Во всех остальных случаях значение элемента массива равно сумме значений двух предыдущих елементов массива
            else {
                Mas[i]=Mas[i-2]+Mas[i-1];
            }
            System.out.print(Mas[i]+" ");
        }
    }
}
