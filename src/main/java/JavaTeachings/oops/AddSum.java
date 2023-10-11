package JavaTeachings.oops;

public class AddSum {
    int a=10, b=15, c=30;

    public static void main(String[] args) {

        int total=0;

        if(new AddSum().a%2==0){
            total = total+new AddSum().a;
        }

        if(new AddSum().b%2==0){
            total = total+new AddSum().b;
        }

        if(new AddSum().c%2==0){
            total = total+new AddSum().c;
        }

        System.out.println("Sum of Even number is :"+total);

    }

}
