package CollectionFramework;

import java.util.LinkedList;

public class LLDemo {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add("Automation");
        ll.add(500);
        ll.add("Catalogue");
        ll.add(500);
        ll.add('R');
        ll.add(56.99);
        ll.add(null);
        ll.add(new Employee());

        System.out.println(ll);

        Object ob1 = ll.getFirst();
        System.out.println(ob1);
        ob1 = ll.getLast();
        System.out.println(ob1);

        ob1 = ll.peek();
        System.out.println(ob1);

        ll.offerFirst("King");
        System.out.println(ll);

    }
}
