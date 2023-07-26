package oops.Inheritance;

public class DemoZ {
    final int x=10;
    final static int y=20;

    final void cube(){
        int x=5;
        int y=x * x * x;
        System.out.println("Cube of the given number is :"+y);
    }

    public static void main(String[] args) {
        final int z=30;
        DemoZ ob = new DemoZ();
        System.out.println(ob.x);




    }
}
