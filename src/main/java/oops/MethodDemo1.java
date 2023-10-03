package oops;

public class MethodDemo1 {
    //instance method - method definition
    //method without return type and without arguments
    void cubeLogic(){
        int x=5;
        int y=x*x*x;
        System.out.println("Cube of the given number is :"+y);
    }
    public static void main(String[] args) {
        System.out.println("Hello India!!!");

        MethodDemo1 ob1 = new MethodDemo1();
        ob1.cubeLogic();

        reverseArray();
        ob1.cubeLogic();
    }

    //class method - method definition
    //method without return type and without arguments
    static void reverseArray(){
        int a[]={4,10,9,8,5,6};
        for(int i=a.length-1;i>=0;--i){
            System.out.print(a[i]+",");
        }
    }
}
