package java8Features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(20);
        al.add(5);
        al.add(15);
        al.add(25);
        System.out.println(al);

        List<Integer> al1 = al.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(al1);
        long count = al.stream().filter(I->I>=20).count();
        System.out.println(count);
        List<Integer> al2 = al.stream().sorted().collect(Collectors.toList());
        System.out.println(al2);
        List<Integer> al3 = al.stream().sorted((i1, i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList());
        System.out.println(al3);
        List<Integer> al4 = al.stream().sorted((i1, i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(al4);



    }
}
