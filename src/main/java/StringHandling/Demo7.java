package StringHandling;

import java.nio.charset.StandardCharsets;

public class Demo7 {
    public static void main(String[] args) {
        byte a[]={100, 99,65, 76,115};
        String s1 = new String(a);
        System.out.println(s1);


        String name ="Deepanshu";
        byte b[]=name.getBytes();
        for(byte b1:b){
            System.out.println(b1);
        }


    }
}
