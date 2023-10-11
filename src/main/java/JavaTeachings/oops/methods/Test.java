package JavaTeachings.oops.methods;

/*
int a[]={4,8,7,9,3,5,6};
Sum of all these numbers
if sum is even --> cube of the give number
if the sum is odd --> prime number logic
 */

public class Test {
    int sumArrays(int a[]){
        int total =0;
        for(int b:a){
            total=total+b;
        }
        return total;
    }

    public static void main(String[] args) {
        int a[]={4,8,7,9,3,5,8};
        Test ob1 = new Test();
        int sum=ob1.sumArrays(a);
        ob1.evenOdd(sum);
    }

    void evenOdd(int s){
        if(s%2==0){
            this.cubeLogic(s);
        }else{
            this.primeLogic(s);
        }
    }

    void cubeLogic(int d){
        int e=d*d*d;
        System.out.println("Cube of the given number is :"+e);
    }

    void primeLogic(int y){
        int count=0;
        for(int i=1;i<=y;++i){
            if(y%i==0){
                ++count;
            }
        }
        if(count==2){
            System.out.println("It is a Prime number");
        }else{
            System.out.println("It is not prime number");
        }

    }

}
