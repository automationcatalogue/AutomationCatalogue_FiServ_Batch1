package java8Features.lambdaexpressions;

public class Test {
    public static void main(String[] args) {
        interf ob1 = ()-> System.out.println("Hello World...");
        ob1.m1();

        interf1 ob2 = (x,y)-> System.out.println(x+y);
        ob2.add(10,20);
        ob2.add(100,200);
        ob2.add(1000,2000);

        interf1 ob3 = (x,y)-> System.out.println(x*y);
        ob3.add(10,20);
    }
}
