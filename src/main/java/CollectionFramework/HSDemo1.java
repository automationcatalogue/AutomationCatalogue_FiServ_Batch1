package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class HSDemo1 {
    public static void main(String[] args) {
        String empNames[]={"Deepanshu","Santhini","Sudharson","Sagar"};
        ArrayList<String> al1 = new ArrayList<String>(Arrays.asList(empNames));
        System.out.println(al1);

        for(String str:al1){
            System.out.println(str);
        }



    }
}
