package StringHandling;

public class Demo8 {
    public static void main(String[] args) {
        char ch[]={'a','u','t','o','m','a','t','i','o','n'};
        String s1 = new String(ch);
        System.out.println(s1);

        String s2="Selenium";
        char ch1[]=s2.toCharArray();
        System.out.println(ch1[2]);
    }
}
