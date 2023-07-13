package fundamentals;

public class PrimeDemo {
    public static void main(String[] args) {
        int n=7;
        int i=1, count=0;
        while(i<=n){
            if(n%i==0){
                count++;
            }
            //System.out.println(i);
            ++i;
        }

        if(count==2){
            System.out.println("Given number is Prime number!!! "+n);
        }else{
            System.out.println("Given number is not Prime number!!! "+n);
        }
    }
}
