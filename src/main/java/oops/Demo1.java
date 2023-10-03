package oops;

public class Demo1 {
    int x=5;

    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        ob1.show();

    }
    static void show(){
        Demo1 ob2 = new Demo1();
        System.out.println(ob2.x);
    }
}
