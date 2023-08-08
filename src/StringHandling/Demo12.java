package StringHandling;

public class Demo12 {
    public static void main(String[] args) {
        int x=120;
        double y=43242.323;

        String s1=String.valueOf(x);
        System.out.println(s1);

        String s2 = String.valueOf(y);
        System.out.println(s2);

        boolean b= s1.equalsIgnoreCase(s2);
        System.out.println(b);
        int z=s2.length();
        System.out.println(z);
    }
}
