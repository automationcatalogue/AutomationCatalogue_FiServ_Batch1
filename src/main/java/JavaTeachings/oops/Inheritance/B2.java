package JavaTeachings.oops.Inheritance;

public class B2 extends A2{
    int y=20;
    int test=200;

    public static void main(String[] args) {
        B2 ob1 = new B2();
        ob1.show();
    }

    void show(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(test);
        System.out.println(super.test);
    }
}
