package JavaTeachings.MultiThreading;

public class Demo {
    public static void main(String[] args) {
        Bank b = new Bank();
        Customer1 c1 = new Customer1(b);
        c1.start();

        Customer2 c2 = new Customer2(b);
        c2.start();
    }
}
