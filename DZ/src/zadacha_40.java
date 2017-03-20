/**
 * Created by Sola on 19.03.2017.
 */


public class zadacha_40 {
    public static void main(String[] args) {
        String msg = "Привет, чувачек!";
        String encmsg = "";
        String decmsg = "";
        String key = "41";
        int keylen = key.length();
        int msglen = msg.length();
        int j;
        System.out.println("Original message: "+msg);
        j = 0;
        for(int i = 0; i < msglen; i++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==keylen) {
                j=0;
            }
        }
        System.out.println("Encoded message: "+encmsg);
        j = 0;
        for(int i = 0; i < msglen; i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j==keylen) {
                j=0;
            }
        }
        System.out.println("Decoded message: "+decmsg);



    }
}
