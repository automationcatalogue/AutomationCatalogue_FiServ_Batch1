package wrapperClasses;

public class Demo5 {
    public static void main(String[] args) {
        try{
            int x=15, y=0;
            int z=x/y;
            System.out.println(z);
        }catch (ArithmeticException ob1){
            System.out.println("Second  number is provided is Zero, please provide another number");
        }


    }
}
