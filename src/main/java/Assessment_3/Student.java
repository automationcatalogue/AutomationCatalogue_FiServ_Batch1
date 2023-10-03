package Assessment_3;

public class Student extends Person{
    private int rollNumber;
    private ClassRoom obj_classRoom;

    Student(int x, int y, char z, int a, ClassRoom ob1){
        super(x,y,z);
        this.rollNumber=a;
        this.obj_classRoom=ob1;
    }

    void display(){
        System.out.println("Roll Number of Student is :"+rollNumber);
        super.display();
    }
}
