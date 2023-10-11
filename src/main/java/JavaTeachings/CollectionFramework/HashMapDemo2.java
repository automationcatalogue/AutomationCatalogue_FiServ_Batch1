package JavaTeachings.CollectionFramework;

import java.util.*;

public class HashMapDemo2 {
    public static void main(String[] args) {
        LinkedHashMap<String, Object> map = new LinkedHashMap<String,Object>();
        map.put("Hyderabad",'H');
        map.put("Java",100);
        map.put("Automation","Catalogue");
        map.put("Chennai",'C');
        map.put("Pune",'P');
        map.put("Bangalore",'H');
        System.out.println(map);

        map.put("Chennai","ch");
        System.out.println(map);

        Object ob1 = map.remove("Pune");
        System.out.println(ob1);
        System.out.println(map);

        map.replace("Delhi","ch","Z");
        System.out.println(map);

        String empNames[]={"Deepanshu","Rohan","Akash","Sagar","Ravi"};
        Integer empAge[]={45,21,34,56,99};
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        for(int i=0;i<empNames.length;i++){
            map2.put(empNames[i],empAge[i]);
        }
        System.out.println(map2);

        LinkedHashMap map3 = new LinkedHashMap<>(map2);
        map.putAll(map3);
        System.out.println(map);

        Set<String> set = map.keySet();
        System.out.println(set);

        Collection<Object> c =  map.values();
        System.out.println(c);

        Set<Map.Entry<String,Object>> allEntries =  map.entrySet();
        for (Map.Entry<String,Object> entry: allEntries){
            String s1=entry.getKey();
            Object ob2 = entry.getValue();
            System.out.println(s1+" --- "+ob2);
        }

        Object ob3 =map.getOrDefault("Hyderabad","Rover");
        System.out.println(ob3);

    }
}
