package innerclasses;

public class X {

    int l=10;

    void show(){
        int a=10,b=20;
        int c=a+b;
        System.out.println("Addition of a,b is :"+c);
    }


    static class Y{
        int m=20;
        static int n=30;
        void display(){
            int a=10;
            if(a%2==0){
                System.out.println("Given number is Even!!!");
            }else {
                System.out.println("Given number is Odd!!!");
            }
        }

        static void print(){
            int a=5;
            int b=a*a*a;
            System.out.println("Cube of the given number is :"+b);
        }
    }

}
