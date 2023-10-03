package filHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) throws Exception{
        Employee e1 = new Employee();
        FileOutputStream fos = new FileOutputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files\\Emp.txt");

        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(e1);
        oos.close();
        fos.close();

        FileInputStream fis = new FileInputStream("C:\\AutomationCatalogue\\Projects\\AutomationCatalogue_FirServ_Batch1\\Files\\Emp.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Employee e2 = (Employee) ois.readObject();
        System.out.println(e2.empNo+"----"+e2.empName);
        ois.close();
        fis.close();


    }
}
