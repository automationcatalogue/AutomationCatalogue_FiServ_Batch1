package innerclasses;

public class Z {
    public static void main(String[] args) {

    }

    void display(){
        class Test{
            void show(){
                int a=10,b=20;
                int c=a+b;
                System.out.println("Addition of a,b is :"+c);
            }
        }
        Test ob1 = new Test();
        ob1.show();
    }
}
