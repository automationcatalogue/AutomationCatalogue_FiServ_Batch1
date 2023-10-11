package JavaTeachings.Assignment2;

public class Assignment2_FactorialNumber {
    public static void main(String[] args) {
        int x=5, fact=1, i=1;
        while(i<=x){
            fact*=i;
            i++;
        }
        System.out.println("Factorial of number 5 is : " +fact);
    }
}
