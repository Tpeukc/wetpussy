/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_15 {
    public static void main(String[] args){
        int[] Mas = new int[8];
        for(int i=0;i<Mas.length;i++){
            Mas[i]=(int)(Math.random()*9+1);
            System.out.print(Mas[i] +" ");
        }
        for(int i=0;i<Mas.length;i++){
            if(Mas[i]%2!=0)Mas[i]=0;
            System.out.println(Mas[i] +"");
        }
    }
}
