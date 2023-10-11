package JavaTeachings.oops;

public class OOPSDemo2 {
    static int test=99;
    int x=100;
    public static void main(String[] args) {

        int qa=100;
        System.out.println(qa);

        System.out.println(test);

        System.out.println(OOPSDemo2.test);

        System.out.println(new OOPSDemo2().test);

        OOPSDemo2 ob1 = new OOPSDemo2();
        System.out.println(ob1.test);

        ob1=null;
        System.gc();
    }
}
