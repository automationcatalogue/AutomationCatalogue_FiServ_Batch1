package oops.polymorphism;

public class B extends A{//subclass
     void print(int x){
        int count=0;
        for(int i=1;i<=x;++i){
            if(x%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("Given number is Prime!!!");
        }else{
            System.out.println("Given number is Not Prime!!!");
        }
    }

    void fact(int y){
        int fact=1;
        for(int i=y;i>=1;--i){
            fact=fact*y;
        }
        System.out.println("factorial of a number is:"+fact);
    }
}
