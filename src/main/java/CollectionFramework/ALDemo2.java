package CollectionFramework;

import java.util.ArrayList;

public class ALDemo2 {
    public static void main(String[] args) {
        ArrayList al1 = new ArrayList();
        al1.add("Sagar");
        al1.add(95);
        al1.add('H');
        System.out.println(al1);

        int l=al1.size();
        System.out.println("Size of the Al1 is :"+l);

        boolean b = al1.isEmpty();
        System.out.println(b);

        al1.remove(2);
        System.out.println(al1);

        al1.clear();
        System.out.println(al1);
        l=al1.size();
        System.out.println("Size of the Al1 is :"+l);

        boolean b1 = al1.isEmpty();
        System.out.println(b1);


    }
}
