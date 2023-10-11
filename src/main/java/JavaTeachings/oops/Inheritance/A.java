package JavaTeachings.oops.Inheritance;

public class A {//super class
    int x=5;//instance variable

    //instance method - method definition
    //method without return type - with arguments
    void primeLogic(int n){
        int count=0;
        for(int i=1;i<=n;++i){
            if(n%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime!!!");
        }else{
            System.out.println("Given number is not Prime!!!");
        }
    }
}
