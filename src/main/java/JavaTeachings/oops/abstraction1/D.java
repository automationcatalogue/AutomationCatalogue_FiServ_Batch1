package JavaTeachings.oops.abstraction1;

public class D implements A{
    public void show(){
        int fact=1, x=5;
        for(int i=x;i>=1;--i){
            fact=fact*x;
        }
        System.out.println("Factorial of a given number is :"+fact);
    }

    void print(){
        System.out.println("JavaScript!!!");
    }
}
