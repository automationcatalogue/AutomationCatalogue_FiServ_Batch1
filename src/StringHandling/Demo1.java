package StringHandling;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = new String("Fi-Serv Batch1");
        System.out.println(s1);

        int l = s1.length();
        System.out.println("Length of the String is :"+l);

        boolean b = s1.isEmpty();
        System.out.println(b);

        String s2 = s1.toUpperCase();
        System.out.println(s2);

        s2= s1.toLowerCase();
        System.out.println(s2);
    }
}
