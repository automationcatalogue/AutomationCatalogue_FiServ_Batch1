package fundamentals;

public class IfDemo3 {
    public static void main(String[] args) {
        int x=40, a,b;
        char ch='A';

        int z=(x<ch)?ch:x;
        System.out.println("Before If condition, value of z is :"+z);
        boolean flag =z>=50 && x>=0;
        if(flag){
            a=10;
            b=20;
            z=a+b;
            System.out.println("Addition of the a,b is :"+z);
        }

        System.out.println("Final Value of z is :"+z);
    }
}
