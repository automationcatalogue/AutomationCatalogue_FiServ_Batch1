package fundamentals;

public class LogicalDemo1 {
    public static void main(String[] args) {



        int x=90, y=75, z=105;
        boolean test = (x==z) && (y!=x);
        System.out.println(test);

        boolean test1 = (x==z) || (y!=x);
        System.out.println(test1);
    }
}
