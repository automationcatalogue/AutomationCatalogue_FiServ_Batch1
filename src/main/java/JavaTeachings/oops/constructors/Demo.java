package JavaTeachings.oops.constructors;

import java.util.Scanner;

public class Demo {

    int z=20;

    Demo(){//default constructor
        this(8);
        int x=10;
        if(x%2==0){
            System.out.println("Given number is Even!!!");
        }else{
            System.out.println("Given number is Odd!!!");
        }
    }

    public static void main(String[] args) {
        Demo ob1 = new Demo();
        Scanner ob = new Scanner(System.in);
    }

    Demo(int x){//Parameterized constructor
        int y = x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }

}
