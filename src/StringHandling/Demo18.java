package StringHandling;

public class Demo18 {
    public static void main(String[] args) {
        String s1=new String("Hello India");
        String s2= new String(" Welcome to Java Program");
        String s3=s1.concat(s2);
        System.out.println(s1);

        StringBuffer sb1 = new StringBuffer("Hello India");
        StringBuffer sb2 = new StringBuffer(" Welcome to Java Program");
        StringBuffer sb3=sb1.append(sb2);
        System.out.println(sb1);
    }
}
