package oops.polymorphism;

public class Demo {
    int x=10;

    Demo get(){
        System.out.println("Core Java!!!");
        Demo ob = new Demo();
        return ob;
    }

    void cube(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube of the give number is :"+y);
    }
}
