package oops.Inheritance;

public class B1 extends A1{
    int y=10;

    int factLogic(int x){
        int fact=1;
        for(int i=x;i>=1;--i){
            fact = fact * x;
        }
        return fact;
    }
}
