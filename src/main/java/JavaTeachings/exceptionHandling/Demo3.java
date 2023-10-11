package JavaTeachings.exceptionHandling;

public class Demo3 {
    public void cube(int a) throws NegativeNumberException{
        if(a>=0){
            int b=a*a*a;
            System.out.println("Cube of the number is :"+b);
        }else{
           throw new NegativeNumberException();
        }
    }

    public static void main(String[] args) throws NegativeNumberException{
        Demo3 ob1 = new Demo3();
        ob1.cube(5);
    }
}
