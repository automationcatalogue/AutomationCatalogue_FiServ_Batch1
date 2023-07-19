package oops;

public class Test2 {

    int sumArray(){
        int a[]={99,23,45,13,88};
        int total =0;
        for(int b:a){
            total=total+b;
        }
        return 1;
    }

    public static void main(String[] args) {
        Test2 ob = new Test2();
        int s=ob.sumArray();
        System.out.println();

    }
}
