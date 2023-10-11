package JavaTeachings.CollectionFramework;

import java.util.ArrayList;

public class ALDemo {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        int x = al.size();
        System.out.println("ArrayList size is :"+x);

        boolean b = al.isEmpty();
        System.out.println("ArrayList isEmpty? "+b);

        al.add("Testing");
        al.add(99);
        al.add(56.235);
        al.add('P');
        al.add(true);

        Employee ob1 = new Employee();
        Employee ob2 = new Employee();

        al.add(ob1);
        al.add(ob2);
        al.add(null);

        System.out.println(al);

        al.add(99);
        System.out.println(al);

        x = al.size();
        System.out.println("ArrayList size is :"+x);
        b=al.isEmpty();
        System.out.println("ArrayList isEmpty? "+b);

        b=al.contains("56.235");
        System.out.println(b);

        Object obA=al.get(3);
        System.out.println(obA);

        al.set(3,"India");
        System.out.println(al);

        al.add(3,"Automation");
        System.out.println(al);

        int z=al.lastIndexOf(99);
        System.out.println(z);

        System.out.println(al);



    }
}
