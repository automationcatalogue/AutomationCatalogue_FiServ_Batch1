package JavaTeachings.oops;

public class Test3 {
    //instance method -method definition
    //method with return type and with arguments
    static int max(int a, int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }

    public static void main(String[] args) {
        Test3.max(10,4);

    }
}
