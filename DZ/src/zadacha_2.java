/**
 * Created by YurievAP on 15.03.2017.
 */
public class zadacha_2 {
    public static void main(String[] args) {


        double n=8.15;
        double m=11.45;
        int a=10;
        double b=Math.abs(a-n);
        double c=Math.abs(a-m);
        if (b==c){
            System.out.println(n +" и "+m + " равноудалены от "+a);
        }
        if(b>c){
            System.out.println(m+" ближе к "+a);
        }
        if (b<c) {
            System.out.println(n+" ближе к "+a);
        }
        }

    }

