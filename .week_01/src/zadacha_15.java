/**
 * Created by YurievAP on 17.03.2017.
 */
public class zadacha_15 {
    public static void main(String[] args) {
        int a =1, b=1, c=0;
        System.out.print(a+" "+b+" ");
        for (int i=3;i<=11;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
    }
}
