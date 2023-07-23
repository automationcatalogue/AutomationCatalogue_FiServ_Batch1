package Assignment2;

public class Assignment2_ReverseNumber {
    public static void main(String[] args) {
        int number=469,reverse=0;
        while(number!=0){
            int remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;

        }
        System.out.println("Reverse number of 469 is " +reverse);
    }
}
