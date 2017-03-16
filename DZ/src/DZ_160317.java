import java.util.Random;
public class DZ_160317  {
    public static void main(String[] args){

            Random rnd = new Random();
            int a = (int) rnd.nextInt(1000);
            int b = a % 10;
            int c = (a / 10) % 10;
            int d = (a / 100) % 10;
            if (b >= c & b > d || b > c & b >= d) {
                System.out.println("В числе " + a + " наибольшая цифра " + b);
            } else {
                if (c > b & c >= d) {
                    System.out.println("В числе " + a + " наибольшая цифра " + c);
                } else {
                    System.out.println("В числе " + a + " наибольшая цифра " + d);
                }
            }




    }
}