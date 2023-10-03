package CollectionFramework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCountDemo {
    public static void main(String[] args) {
        String str ="Collections is part of Core Java and Java Program is divides into two and Core Java and Advanced Java";

        String str1[]=str.split(" ");
        LinkedHashMap<String,Integer> map = new LinkedHashMap<String,Integer>();
        for(String s:str1){
            Integer count=map.get(s);
            if(map.containsKey(s)){
                map.put(s,count+1);
            }else{
                map.put(s,1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<String, Integer>> allEntries = map.entrySet();
        for(Map.Entry<String, Integer> entry:allEntries){
            Integer i=entry.getValue();
            if(i>=2){
                System.out.println(entry.getKey()+"--"+entry.getValue());
            }
        }
    }

}
