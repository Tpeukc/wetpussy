/**
 * Created by YurievAP on 17.03.2017.
 */
public class zadacha_19 {
    public static void main(String[] args){
        int b=0; //---> счетчик симметрии

        // Первый цикл - часы, а второй цикл - минуты.
        for(int h=0;h<=24;h++){
            for(int m=0;m<=59;m++){
                //Сравниваем значения чисел, увеличиваем счетчик
                if(h/10%10==m%10&h%10==m/10%10){
                    b++;
                }
            }
        }
        System.out.println("Всего "+b+" симметрических совпадений");
    }
}
