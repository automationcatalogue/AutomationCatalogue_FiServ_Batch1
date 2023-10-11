package JavaTeachings.fundamentals;

public class NonPrimeDemo {

    public static void test(){
        int a=10, b=20;
        int c=a+b;
        System.out.println("Addition of two numbers is :"+c);
    }

    public static void main(String[] args) {

         int k=1;
         for(int nonPrimeCount=1;nonPrimeCount<=5;++k){//outer loop

             int count=0;
             for(int i=1;i<=k;++i){//inner loop
                 if(k%i==0){
                     ++count;
                 }
             }

             if(count>2) {
                 System.out.print(k+",");
                 ++nonPrimeCount;
             }
         }
    }
}
