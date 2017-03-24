/**
 * Created by YurievAP on 17.03.2017.
 */
public class zadacha_20 {
    public static void main(String[] args) {
        int b = 0; //счетчик

        for(int i=4;i<=99994;i++){ //цикл перебора
            String s=String.valueOf(i);
            if(s.indexOf('4')!=-1) { //встречается символ 4 - увеличиваем счетчик
                b++;


            }
            //ищем 13, сначала ищем символ 1 за которым сразу идет символ 3 - увеличиваем счетчик
            else if(s.indexOf('1')!=-1&s.indexOf('1')+1==s.indexOf('3')){
                b++;

            }
            }

        System.out.println("Нужно исключить "+b+" номеров");

    }


}