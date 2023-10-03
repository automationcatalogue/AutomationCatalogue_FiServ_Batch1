package Assignment2;

public class Assignment2_DescendingOrder {
    public static void main(String[] args) {
        int a=700, b=100, c=500;
        System.out.println("DESCENDING ORDER");
        if (a>b && a>c){
            System.out.println(a);
        }else
            System.out.println(b + " and " + c);
        if(b>c){
            System.out.println(b);
            System.out.println(c);
        }else if (c>b){
            System.out.println(c);
            System.out.println(b);
        }


    }
}
