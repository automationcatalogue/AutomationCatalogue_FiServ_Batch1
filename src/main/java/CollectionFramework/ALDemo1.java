package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class ALDemo1 {
    public static void main(String[] args) {
        String empNames[]={"Muklesh", "Ankush","Sunil","Santhini","Swati"};
        Integer salaries[]={50000,25000,98000,63000};
        String cities[]={"Pune","Chennai","Bangalore","Hyderabad","Noida"};

        ArrayList al1 = new ArrayList(Arrays.asList(empNames));
        System.out.println(al1);

        ArrayList al2 = new ArrayList(Arrays.asList(salaries));
        System.out.println(al2);

        ArrayList al3 = new ArrayList(Arrays.asList(cities));
        System.out.println(al3);

        al1.addAll(al2);
        al1.addAll(al3);
        System.out.println(al1);

        al1.remove(1);
        System.out.println(al1);
        Integer i1 = new Integer(25000);
        al1.remove(i1);
        System.out.println(al1);

        boolean b =al1.containsAll(al3);
        System.out.println(b);

        al1.removeAll(al2);
        System.out.println(al1);

        al1.retainAll(al3);
        System.out.println(al3);



    }
}
