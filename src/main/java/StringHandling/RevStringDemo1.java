package StringHandling;

public class RevStringDemo1 {
    public static void main(String[] args) {
        String s1 = "Fi-Serv Batch1 Automation";
        // o/p: --> vreS-iF 1hctaB noitanotuA
        String s2[]=s1.split(" ");
        String revString="";

        for(String s3:s2){
            for(int i=s3.length()-1;i>=0;--i){
                char ch = s3.charAt(i);
                revString=revString+ch;
            }
            revString=revString+" ";
        }
        System.out.println(revString);
    }
}
