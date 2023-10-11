package JavaTeachings.wrapperClasses;

public class Demo4 {
    public static void main(String[] args) {
        String str="Order Number placed :TZ3530";
        String str1[]=str.split(":");

        System.out.println(str1[1]);

        int x=Integer.parseInt(str1[1]);
        x=x+100;
        System.out.println(x);
    }
}
