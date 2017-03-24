/**
 * Created by YurievAP on 15.03.2017.
 */
public class zadacha_03 {
    public static void main(String[] args) {
        double a = 1;
        double b = 12;
        double c = 36;
        double x1, x2;
        double d = (b * b) - (4 * a * c);
               if (d == 0) {
            x1 = -1 * (b / (2 * a));
            System.out.println("Уравнеие имеет 1 квадратный корень, который равен " + x1);
        } else {
            if (d > 0) {
                x1 = (-1 * b + Math.sqrt(d)) / (2 * a);
                x2 = (-1 * b - Math.sqrt(d)) / (2 * a);
                System.out.println("Уравнение имеет 2 квадратных корня: " + x1 + " и " + x2);
            } else {
                System.out.println("Уравнение не имеет квадратных корней");
            }
        }
    }
}
