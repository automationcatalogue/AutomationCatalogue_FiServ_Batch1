package JavaTeachings.fundamentals;

public class NestedIfDemo2 {
    public static void main(String[] args) {
        int a=8, b=10, c=6;
        //c,a,b

        if(a<b && a<c){
            System.out.println(a);
            if(b<c){
                System.out.println(b);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(b);
            }
        }else if(b<a && b<c){
            System.out.println(b);
            if(a<c){
                System.out.println(a);
                System.out.println(c);
            }else{
                System.out.println(c);
                System.out.println(a);
            }
        }else if(c<a && c<b){
            System.out.println(c);
            if(a<b){
                System.out.println(a);
                System.out.println(b);
            }else{
                System.out.println(b);
                System.out.println(a);
            }
        }
    }

}
