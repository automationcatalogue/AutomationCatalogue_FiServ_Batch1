package JavaTeachings.oops.polymorphism;

public class Demo2 {
    int t = 20;

    Demo2() {

        t = 40;

    }

}

class Main {

    public static void main(String args[]) {

        Demo2 t1 = new Demo2();

        System.out.println(t1.t);

    }
}
