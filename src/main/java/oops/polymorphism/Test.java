package oops.polymorphism;

public class Test extends Demo{

    int y=20;

    Test get(){
        System.out.println("Advanced Java!!!");
        Test ob = new Test();
        return ob;
    }

    void evenOdd(int x){
        if(x%2==0){
            System.out.println("Given number x is Even!!! "+x);
        }else{
            System.out.println("Given number x is Odd!!! "+x);
        }
    }


}
