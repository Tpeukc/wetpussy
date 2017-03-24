/**
 * Created by Sola on 19.03.2017.
 */
public class zadacha_28 {
    public static void main(String[] args) {

        int mas1[] = new int[12];

        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = (int) Math.floor(Math.random() * 31) - 15;
            System.out.print(mas1[i] + " ");

        }
        int max = mas1[0], index = 0;
        for (int i = 0; i < mas1.length; i++) {
            if (mas1[i] >= max ) {
                max = mas1[i];
                index = i;
            }
        }
        System.out.println(" ");
        System.out.println("Самое большое число " + max + " и индекс его последнего вхождения " + index);
    }
}
