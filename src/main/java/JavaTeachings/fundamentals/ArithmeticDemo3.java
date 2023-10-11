package JavaTeachings.fundamentals;

public class ArithmeticDemo3 {

    public static void main(String[] args) {
        int x=50, y=70, z;
        z=x+y;
        System.out.println("Value of z is :"+z);
        x=90;
        y=10;
        z=z+y;
        System.out.println("Value of z is :"+z);

        x=x-y;//subtraction
        System.out.println("Value of x is :"+x);

        y=z*x;//multiplication
        System.out.println("value of is :"+y);

        y=y/2;
        System.out.println("value of is :"+y);

        x=19;
        y=3;
        x=x%y;
        System.out.println("outcome of the % is :"+x);

        System.out.println(53%10);
    }
}
