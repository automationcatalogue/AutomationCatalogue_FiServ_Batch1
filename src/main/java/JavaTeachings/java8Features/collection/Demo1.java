package JavaTeachings.java8Features.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<Employee>();
        al.add(new Employee("Sagar",42342));
        al.add(new Employee("Deepanshu",10423));
        al.add(new Employee("Sumith",64533));
        al.add(new Employee("Dharanishankar",53432));
        System.out.println(al);

       Comparator<Employee> c = (e1, e2)->-e1.empName.compareTo(e2.empName);
       Collections.sort(al,c);
       System.out.println(al);

    }
}
