package JavaTeachings.fundamentals;

public class LogicalDemo2 {
    public static void main(String[] args) {
        int x=25, y=26, a=90, b=91;

        boolean flag = x<=y && a<=b;
        System.out.println(flag);

        flag = x<=++y && a<=b++;
        System.out.println(flag);

        flag = ++x>=y || a>b++;
        System.out.println(flag);
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of x is:"+x+" Value of y is :"+y);



    }
}
