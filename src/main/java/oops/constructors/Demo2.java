package oops.constructors;

public class Demo2 {
    public static void main(String[] args) {
        Emp1 e1 = new Emp1(101,10000.00f);
        System.out.println(e1.empNo+" - "+e1.empSalary);

        Emp1 e2 = new Emp1(102, 20000.00f);
        System.out.println(e2.empNo+" - "+e2.empSalary);

        Emp1 e3 = new Emp1(103, 30000.00f);
        System.out.println(e3.empNo+" - "+e3.empSalary);

    }
}
