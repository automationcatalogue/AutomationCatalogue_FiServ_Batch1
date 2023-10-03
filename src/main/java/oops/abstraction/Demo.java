package oops.abstraction;

abstract public class Demo {
    //abstract method
    public abstract void show();

    //Non-abstract method
   void prime(int x){
       int count=0;
       for(int i=1;i<=x;++i){
           if(x%i==0){
               ++count;
           }
       }
       if(count==2){
           System.out.println("Given number "+x+ " is a Prime!!!");
       }else{
           System.out.println("Given number "+x+ " is not a Prime!!!");
       }
   }

}
