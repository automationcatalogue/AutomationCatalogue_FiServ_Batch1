package JavaTeachings.CollectionFramework;

import java.util.HashMap;

public class HMDemo {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Object ob = map.put(1,"Core Java");
        System.out.println(ob);

        map.put(2,"Advanced Java");
        map.put(3,"Python");
        map.put(4,"Selenium");
        map.put(5,"JavaScript");

        System.out.println(map);

        ob=map.put(3,"Ruby");
        System.out.println(map);
        System.out.println(ob);

        map.put(6,"Selenium");
        System.out.println(map);

        int size = map.size();
        System.out.println(size);

        map.put("City","Hyderabad");
        map.put("EmpName","Muklesh");
        System.out.println(map);

        System.out.println(map.isEmpty());
        Object ob2 =map.get("City");
        System.out.println(ob2);

        boolean b = map.containsKey(5);
        System.out.println(b);
        b = map.containsValue("Selenium");
        System.out.println(b);


    }
}
