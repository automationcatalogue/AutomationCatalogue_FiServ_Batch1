package JavaTeachings.oops.Inheritance;

public class Test {
    public static void main(String[] args) {
        /*A ob1 = new A();
        System.out.println(ob1.x);
        ob1.primeLogic(5);

        //System.out.println(ob1.y);
        //ob1.factLogic(6);*/

        B ob2 = new B();
        System.out.println(ob2.x);
        ob2.primeLogic(5);

        System.out.println(ob2.y);
        int z=ob2.factLogic(6);
        System.out.println("Factorial output is :"+z);
    }
}
