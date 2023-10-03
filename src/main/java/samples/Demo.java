package samples;

public class Demo {

    protected int x=10;//instance variable

    public static int y=20;//class variable

    public void cube(int x){ //instance method
        int y=x * x*x;
        System.out.println("Cube of the given number is :"+y);
    }

    static int add(int a, int b){//class method
        int c=a+b;
        return c;
    }

    public static void main(String[] args) {
        Demo ob = new Demo();
        System.out.println(ob.x);

        System.out.println(y);

        ob.cube(5);

        int h=add(10,20);
        System.out.println("Addition of a,b is :"+h);
    }
}
