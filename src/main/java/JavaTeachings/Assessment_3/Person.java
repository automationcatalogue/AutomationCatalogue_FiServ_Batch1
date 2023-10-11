package JavaTeachings.Assessment_3;

public class Person {
    public int getAge() {
        return age;
    }

    private int age;

    public int getId() {
        return id;
    }

    private int id;

    public char getGender() {
        return gender;
    }

    private char gender;

    Person(int x, int y, char z){
        this.age=x;
        this.id=y;
        this.gender=z;
    }

    void display(){
        System.out.println("Age value is :"+age);
        System.out.println("Id Value is :"+id);
        System.out.println("Gender Value is :"+gender);
    }
}
