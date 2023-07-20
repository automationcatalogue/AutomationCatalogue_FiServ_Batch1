package Assignment1;

import java.util.Scanner;

public class Assignment1_Marks {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the value of Tamil");
        int Tamil=ob.nextInt();
        System.out.println("Enter the value of English");
        int English=ob.nextInt();
        System.out.println("Enter the value of Maths");
        int Maths=ob.nextInt();
        System.out.println("Enter the value of Science");
        int Science=ob.nextInt();
        System.out.println("Enter the value of Social");
        int Social=ob.nextInt();
        float Total=Tamil+English+Maths+Science+Social;
        System.out.println("The value of Total is :" +Total);
        float Average=Total/5;
        System.out.println("The Value of Average is : " +Average);
        if(Average>70){
            System.out.println("Distinction");
        }else if(Average>=60 && Average<70){
            System.out.println("First Class");
        }else if(Average>=50 && Average<60){
            System.out.println("Second Class");
        }else if(Average>=40 && Average<50){
            System.out.println("Third Class");
        }else if(Average<40){
            System.out.println("Failed");
        }

    }
}

