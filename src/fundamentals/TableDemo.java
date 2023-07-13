package fundamentals;

public class TableDemo {
    public static void main(String[] args) {

        TableDemo ob1 = new TableDemo();

        for(int a=1;a<=10;++a){
            for(int i=1;i<=10;++i){
                System.out.println(a+" * "+i+" = "+(a*i));
            }
            System.out.println("============================");
        }
    }
}
