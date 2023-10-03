package oops;

public class ArraysDemo {
    int a[]={72,45,500,68,95,34,78,23,90,12,34};

    public static void main(String[] args) {
        ArraysDemo ob1 = new ArraysDemo();
        int oddSum=0;

        for(int i=0;i<ob1.a.length;++i){
            if(ob1.a[i]%2!=0){
                oddSum = oddSum+ob1.a[i];
            }
        }

        System.out.println("Sum of All Odd numbers is :"+oddSum);

    }
}
