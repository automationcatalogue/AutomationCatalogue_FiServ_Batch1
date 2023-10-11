package JavaTeachings.oops;

public class Test1 {

    float factorialLogic(){
        int x=5;
        int fact =1;
        for(int i=x;i>=1;--i){
            fact = fact *i;
        }
        return 34.56f;
    }

    public static void main(String[] args) {
        System.out.println("Core Java!!!");

        Test1 ob = new Test1();
        float y=ob.factorialLogic();
        System.out.println("Value of y is :"+y);

    }
}
