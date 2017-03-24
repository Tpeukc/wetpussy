/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_29 {

    public static void main(String[] args){
        //Создадим 3 массива
        int[] Mas1=new int[10];
        int[] Mas2=new int[10];
        double[]Mas3=new double[10];
        //Создадим переменную от значения которой будет зависит корректность вывода количества целых чисел в 3 массиве.
        int SC=0;
        //При помощи цикла заполним значения каждого массива
        for(int i=0,b=1;b<=4;i++){
            if(b==1){
                Mas1[i]=(int)(Math.random()*8)+1;
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(Mas1[i]+" ");
                if(i==Mas1.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }
            if(b==2){
                Mas2[i]=(int)(Math.random()*8)+1;
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(Mas2[i]+" ");
                if(i==Mas2.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }
            if(b==3){
                Mas3[i]=(double)Mas1[i]/Mas2[i];
                if(i==0)
                    System.out.print((b)+ " массив состоит из следующих элементов: ");
                System.out.print(Mas3[i]+ " ");
                if(i==Mas3.length-1){
                    b++;
                    i=0;
                    System.out.println(" ");
                }
            }

            if(b==4){
                if(Mas3[i]%(int)Mas3[i]==0){
                    if(SC==0)
                        System.out.print("В 3 массиве следующие целые числа: ");
                    SC++;
                    System.out.print(Mas3[i]+", ");
                }
                if(i==Mas3.length-1){
                    if(SC==0)
                        System.out.println("В третьем массиве нет целых чисел!");
                    break;
                }
            }

        }

    }
}
