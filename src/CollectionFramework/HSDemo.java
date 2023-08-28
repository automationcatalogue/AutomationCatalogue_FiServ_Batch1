package CollectionFramework;

import java.util.HashSet;

public class HSDemo {
    public static void main(String[] args) {
        HashSet hs = new HashSet();
        boolean b=hs.add("AutomationCatalogue");
        System.out.println(b);

        hs.add(100);
        hs.add('G');
        hs.add(false);
        hs.add(78.96);
        hs.add(null);
        hs.add(new Employee());

        b=hs.add("AutomationCatalogue");
        System.out.println(b);
        System.out.println(hs);
    }
}
