package java8Features.collection;

import java.util.Comparator;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Comparator<Integer> c = (ob1, ob2) ->(ob1>ob2)?1:(ob1<ob2)?-1:0        ;
        TreeSet t = new TreeSet<>(c);
        t.add(15);
        t.add(5);
        t.add(10);
        t.add(20);
        t.add(25);
        System.out.println(t);
    }
}
