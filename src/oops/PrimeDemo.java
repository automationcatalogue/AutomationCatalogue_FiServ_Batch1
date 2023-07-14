package oops;

public class PrimeDemo {

    public static void main(String[] args) {
        Test ob1 = new Test();
        int count=0;
        for(int i=1;i<=ob1.x;i++){
            if(ob1.x%i==0){
                ++count;
            }
        }
        if(count>2){
            System.out.println("Given number is Non-Prime");
        }else{
            System.out.println("Given number is Prime");
        }
    }
}
