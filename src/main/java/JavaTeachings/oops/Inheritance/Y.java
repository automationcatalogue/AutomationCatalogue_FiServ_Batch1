package JavaTeachings.oops.Inheritance;

public class Y extends X{
    //Default constructor
    Y(){
        System.out.println("Advanced Java!!!");
    }

    Y(int a, int b){
        this();
        int c=a*b;
        System.out.println("Multiplication of a, b is :"+c);
    }
}
