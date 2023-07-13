package fundamentals;

public class AssignmentDemo {
    public static void main(String[] args) {
        int i=9, j=3, k=4;
        i+=10;
        j-=i;
        System.out.println("Value of i is :"+i+" value of j is:"+j);//19, -16

        int a=10, b=45;
        b+=a;
        System.out.println("Value of a is :"+a+" Value of b is :"+b);

        a-=b;
        System.out.println("Value of a is :"+a+" Value of b is :"+b);

        int c=(a*=3);
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of c is :"+c);

        c/=10;
        System.out.println("Value of c is :"+c);

        b%=c;
        System.out.println("Value of a is :"+a+" Value of b is :"+b+" Value of c is :"+c);

    }
}
