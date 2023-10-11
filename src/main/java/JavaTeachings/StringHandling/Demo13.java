package JavaTeachings.StringHandling;

public class Demo13 {
    public static void main(String[] args) {
        String s1 = "OrderNumber:32131 abcd";
        String s3[]=s1.split(":");
        String s4[]=s3[1].split(" ");
        System.out.println(s4[1]);


        //String s2=s1.split(":")[1].split(" ")[0];
        //System.out.println(s2);
    }

}
