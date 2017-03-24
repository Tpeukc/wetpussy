/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_34 {
    public static void main(String[] args) {
        //Создадим массив с заданными параметрами
        int[][] Mas = new int[8][5];
        //Заполним массив при помощи двух вложенных циклов, первым (внешним циклом заполним значения строк, вторым (внутренним) значения столбцов
        for(int i=0;i<Mas.length;i++){
            for(int j=0;j<Mas[i].length;j++){
                Mas[i][j]=(int)(Math.random()*90)+10;
                System.out.print(Mas[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
