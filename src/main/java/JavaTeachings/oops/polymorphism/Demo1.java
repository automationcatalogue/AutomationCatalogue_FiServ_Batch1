package JavaTeachings.oops.polymorphism;

public class Demo1 {
    //instance method - method definition
    void print(){
        System.out.println("Core Java!!!");
    }

    int print(int x){
        int y=x*x*x;
        System.out.println("Cube of the given number is:"+y);
        return y;
    }

    float print (int x, int y){
        float z=x+y;
        System.out.println("Addition of x,y is :"+z);
        return z;
    }

    void print(float x, float y){
        float z=x-y;
        System.out.println("Subtraction of x,y is :"+z);
    }

    void print(int a, float b){
        System.out.println("Python");
    }

    void print(float a, int b){
        System.out.println("Javascript");
    }

    public static void main(String[] args) {
        Demo1 ob1 = new Demo1();
        ob1.print(10.235f,20);
    }
}
