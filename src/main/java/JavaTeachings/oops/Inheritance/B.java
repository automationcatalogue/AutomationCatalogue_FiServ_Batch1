package JavaTeachings.oops.Inheritance;

public class B extends A{//sub class
    int y=10;//instance variable

    //instance method - method definition
    //method with return type and with arguments
    int factLogic(int x){
        int fact=1;
        for(int i=x;i>=1;--i){
            fact = fact * x;
        }
        return fact;
    }
}
