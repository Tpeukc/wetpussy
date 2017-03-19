/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_13 {
    public static void main(String[] args){
        int a=0;
        for(int i=1;i<=99;i++){
            if(i%2!=0)a++;
        }
        int[] Mas = new int[a];
        for(int i=1,b=0;i<=99;i++){
            if(i%2!=0){
                Mas[b]=i;
                System.out.print(Mas[b]+" ");
                b++;
            }
        }
        System.out.println(" ");
        for(int i=Mas.length-1;i>=0;i--){
            System.out.println(Mas[i]);
        }
    }

}
