package JavaTeachings.oops.abstraction;

public class Test extends Demo{
   public void show(){
        int a=10, b=20;
        int c=a+b;
        System.out.println("Addition of a, b is :"+c);
    }

    void fact(int x){
        int fact=1;
        for(int i=x;i>=1;--i){
            fact = fact*i;
        }
        System.out.println("Factorial of a given number is :"+x);
    }
}
