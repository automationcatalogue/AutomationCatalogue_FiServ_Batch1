package StringHandling;

public class RevStringDemo {
    public static void main(String[] args) {
        String s1="Automation Catalogue";
        String revString="";

        for(int i=s1.length()-1;i>=0;--i){
            char ch = s1.charAt(i);
            revString=revString+ch;
        }
        System.out.println("Reverse of a String is :"+revString);
    }
}
