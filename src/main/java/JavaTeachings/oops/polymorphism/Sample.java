package JavaTeachings.oops.polymorphism;

public class Sample {
    public static void main(String[] args) {
        Test ob1 = new Test();
        ob1.evenOdd(10);
        ob1.cube();

        Test ob2 = ob1.get();
        System.out.println(ob2.y);
    }
}
