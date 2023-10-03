package StringHandling;

public class Demo10 {
    public static void main(String[] args) {
        String s1="Fi-Serv Batch1 Strength is more than 30 candidates";
        String s2 = s1.substring(10);
        System.out.println(s2);

        String s3 = s1.substring(15,22);
        System.out.println(s3);

        String s4 = s2.concat(s3);
        System.out.println(s4);

        String s5[]=s1.split("abcd");
        for(String s:s5){
            System.out.println(s);
        }


    }
}
