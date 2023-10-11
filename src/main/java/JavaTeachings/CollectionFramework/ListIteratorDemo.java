package JavaTeachings.CollectionFramework;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Testing");
        ll.add("Core Java");
        ll.add("Selenium");
        ll.add("Advanced Java");
        ll.add("Jenkins");

        ListIterator<String> ltr = ll.listIterator();
        while(ltr.hasNext()){
            String s1 = ltr.next();
            if(s1.contains("Java")){
                ltr.set("Python");
            }
        }

        while(ltr.hasPrevious()){
            System.out.println(ltr.previous()+" ");
        }

    }
}
