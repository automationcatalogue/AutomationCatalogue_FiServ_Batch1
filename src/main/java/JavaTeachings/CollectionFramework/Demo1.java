package JavaTeachings.CollectionFramework;

import java.util.ArrayList;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList ob1 = new ArrayList(100);
        ob1.add("Hyderabad");
        ob1.add(10+20);
        ob1.add(false);
        ob1.add(10.256);
        ob1.add('c');
        ob1.add(null);
        ob1.add("Hyderabad");
        ob1.add("Chennai");
        ob1.add(50000);

        Employee e1 = new Employee();
        Employee e2 = new Employee();

        ob1.add(e1);
        ob1.add(e2);

        System.out.println(ob1);
    }
}
