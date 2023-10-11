package JavaTeachings.Assessment_3;

public class Teacher extends Person{
    private int experienceYears;
    private Subject obj_Subject;

    Teacher(int x, int y, char z, int a, Subject ob1){
        super(x,y,z);
        this.experienceYears=a;
        this.obj_Subject=ob1;
    }

    void display(){
        System.out.println("Experience Years of Student is :"+experienceYears);
        super.display();
    }
}
