package fundamentals;

import java.util.Scanner;

public class IfElseDemo3 {
    public static void main(String[] args) {

        Scanner ob = new Scanner(System.in);
        System.out.println("Please value enter for m");
        int m=ob.nextInt();
        System.out.println("Please enter value for e");
        int e=ob.nextInt();
        System.out.println("Please enter value for so");
        int so=ob.nextInt();
        System.out.println("Please enter value for sc");
        int sc = ob.nextInt();
        System.out.println("Please enter value for h");
        int h = ob.nextInt();

        float total = m+e+so+sc+h;
        float avg = total/5;
        System.out.println("Avergae of student marks are :"+avg);

        if(avg>=70){
            System.out.println("Distinction!!!");
        }else if(avg>=60 && avg<70){
            System.out.println("First Class");
        }else if(avg>=60 && avg<70){
            System.out.println("Second Class");
        }else if(avg>=40 && avg<50){
            System.out.println("Third Class");
        }else if(avg<40){
            System.out.println("Failed!!");
        }
    }
}
