package StringHandling;

public class Demo4 {
    public static void main(String[] args) {
        String s1 = "Core Java Programming is Interesting Advanced Java Programming is also Interesting";
        System.out.println(s1);

        String s2 = s1.replace('a','z');
        System.out.println(s2);

        s2 = s1.replaceAll("Java","Python");
        System.out.println(s2);

        s2=s1.replaceFirst("Programming","abcd");
        System.out.println(s2);
    }
}
