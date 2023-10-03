package StringHandling;

public class Demo3 {
    public static void main(String[] args) {
        String s1 ="tajmahal";
        String s2 ="tajmahal india";

        boolean b = s1.equals(s2);
        System.out.println(b);

       b= s1.equalsIgnoreCase(s2);
        System.out.println(b);

        b=s2.contains(s1);
        System.out.println(b);
    }
}
