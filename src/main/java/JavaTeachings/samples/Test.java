package JavaTeachings.samples;

public class Test {
    public static void main(String[] args) {
        Demo ob1 = new Demo();
        System.out.println(ob1.x);

        System.out.println(Demo.y);

        ob1.cube(5);

        int h = Demo.add(10,20);
        System.out.println("Addition of a,b is :"+h);
    }
}
