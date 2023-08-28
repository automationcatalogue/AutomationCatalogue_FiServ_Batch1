package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HSDemo1 {
    public static void main(String[] args) {
        String empNames[]={"Deepanshu","Santhini","Sudharson"};
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(empNames));
        System.out.println(al1);

        Integer empSalaries[] ={25000,40000};
        ArrayList<Integer> al2 = new ArrayList<Integer>(Arrays.asList(empSalaries));
        System.out.println(al2);

        Character empGenders[] ={'M','F','M','F'};
        ArrayList<Character> al3 = new ArrayList<Character>(Arrays.asList(empGenders));
        System.out.println(al3);

        ArrayList al = new ArrayList();
        al.addAll(al1);
        al.addAll(1,al2);
        al.addAll(3,al3);
        System.out.println(al);

        al.add(25000);
        al.add("Santhini");
        System.out.println(al);

        HashSet hs = new HashSet(al);
        System.out.println(hs);
        int size = hs.size();
        System.out.println(size);
        hs.remove(25000);
        System.out.println(hs);

        LinkedHashSet lhs = new LinkedHashSet(al);
        System.out.println(lhs);


    }
}
