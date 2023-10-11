package JavaTeachings.oops.Inheritance;

public class X {
    //Default Constructor
    X(){
        this(10,20);
        System.out.println("Core Java");
    }

    //Parameterized constructor
    X(int a, int b){
        int c=a+b;
        System.out.println("Sum of a, is :"+c);
    }
}
