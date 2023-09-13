package java8Features.collection;

public class Employee {
    String empName;
    int empNo;

    Employee(String name, int no){
        this.empName=name;
        this.empNo=no;
    }

    public String toString(){
        return empName;
    }
}
