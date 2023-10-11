package JavaTeachings.StringHandling;

public class Demo9 {
    public static void main(String[] args) {
        String str="Core Java and Advanced Java are two major modules";
        boolean b = str.startsWith("Java");
        System.out.println(b);

        b=str.startsWith("Java",5);
        System.out.println(b);

        b = str.endsWith("major modules");
        System.out.println(b);

        int a=str.indexOf("Python");
        System.out.println(a);

        a=str.lastIndexOf("Java");
        System.out.println(a);
    }
}
