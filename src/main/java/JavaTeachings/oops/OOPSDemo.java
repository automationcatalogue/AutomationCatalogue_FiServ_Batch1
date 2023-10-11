package JavaTeachings.oops;

public class OOPSDemo {

    int a=99;//instance variable

    public static void main(String[] args) {
        int x=20;//Local variable
        System.out.println("Value of x is :"+x);

        System.out.println(new OOPSDemo().a);//By using Object

        OOPSDemo ob1 = new OOPSDemo();
        System.out.println(ob1.a);

    }
}
