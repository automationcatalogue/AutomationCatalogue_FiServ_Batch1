package innerclasses;

public class Test1 {
    public static void main(String[] args) {
        X ob1 = new X();
        System.out.println(ob1.l);
        ob1.show();

        X.Y.print();
        X.Y ob2 = new X.Y();
        ob2.display();
        System.out.println(ob2.m);
        System.out.println(X.Y.n);
    }
}
