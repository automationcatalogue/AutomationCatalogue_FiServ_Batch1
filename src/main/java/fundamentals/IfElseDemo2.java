package fundamentals;

public class IfElseDemo2 {
    public static void main(String[] args) {
        int x=80, y,z;
        System.out.println("x value is :"+x);
        ++x;
        if(x++==82){
            System.out.println("value of x is 100");
        }else{
            System.out.println(x);
            System.out.println("Value of x is 900");

        }
        System.out.println("Value of x is :"+x);
    }
}
