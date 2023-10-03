package StringHandling;

public class Demo16 {
    public static void main(String[] args) {
        String s1 = "Hello India";
        String s2 = "Hello India";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//true

        String s3 = new String("Hello India");
        String s4 = new String("Hello India");
        System.out.println(s3.equals(s4));
        System.out.println(s3==s4);
    }
}
