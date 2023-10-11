package JavaTeachings.fundamentals;

public class RelationDemo1 {
    public static void main(String[] args) {
        int i=10, j=20;
        boolean test = i>j;
        System.out.println(test);

        int k=20;
        test = (j-i)<=k;
        System.out.println(test);

        boolean test1 = j<=k;
        System.out.println(test1);

        test1 = j<k;
        System.out.println(test1);

        System.out.println(i>=10);
        i+=10;
        System.out.println(i==j);
        System.out.println(i!=j);
        System.out.println(15!=k);


    }
}
