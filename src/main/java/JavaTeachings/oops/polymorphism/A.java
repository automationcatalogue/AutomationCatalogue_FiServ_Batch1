package JavaTeachings.oops.polymorphism;

public class A {//super class
    //instance - method definition
    void print(int x){
        if(x%2==0){
            System.out.println("Given number x is Even!!! "+x);
        }else{
            System.out.println("Given number x is Odd!!! "+x);
        }
    }

    void cube(int a){
        int b=a*a*a;
        System.out.println("Cube of the given number is :"+b);
    }
}
