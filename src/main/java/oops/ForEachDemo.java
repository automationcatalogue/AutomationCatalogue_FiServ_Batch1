package oops;

public class ForEachDemo {
    public static void main(String[] args) {
        int a[]={72,45,500,68,95,34,78,23,90,12,34};

        int oddSum =0;
        for(int b:a){
            if(b%2!=0){
                oddSum = oddSum+b;
            }
        }
        System.out.println("Sum of all Odd number is :"+oddSum);
    }
}
