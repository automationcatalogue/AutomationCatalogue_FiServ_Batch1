package JavaTeachings.java8Features;

public class Test1 {
    public static void main(String[] args) {
        Interf1 ob = new Interf1(){
            public void add(int x, int y){
                int z=x+y;
                System.out.println("Addition is "+z);
            }
        };
        ob.add(10,20);
    }
}
