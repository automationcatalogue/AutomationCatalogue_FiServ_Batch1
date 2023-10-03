package java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sagar");
        al.add("Automation");
        al.add("Tester");
        al.add("Pavan");
        al.add("Hyder");
        System.out.println(al);

        Comparator<String> c =(s1,s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if(l1<l2) return -1;
            else if(l1>l2) return +1;
            else return s1.compareTo(s2);
        };
        List<String> sortedList = al.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedList);

    }
}
