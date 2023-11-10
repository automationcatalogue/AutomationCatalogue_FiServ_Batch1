package apiTestCases;

import pojos.Address;
import pojos.Contacts;
import pojos.Customer;

import java.util.ArrayList;
import java.util.List;

public class TC08_POJOBuilder {
    public static void main(String[] args) {
        Customer ob = new Customer();
        ob.setName("John Doe");
        ob.setAge(30);

        Address ob1 = new Address();
        ob1.setStreet("123 Main St");
        ob1.setCity("Cityville");
        ob1.setZipcode("12345");
        ob.setAddress(ob1);

        Contacts ob2 = new Contacts();
        ob2.setType("email");
        ob2.setValue("john.doe@example.com");

        Contacts ob3 = new Contacts();
        ob3.setType("phone");
        ob3.setValue("123-456-7890");

        List<Contacts> ob5 = new ArrayList<>();
        ob5.add(ob2);
        ob5.add(ob3);

        ob.setContacts(ob5);

        System.out.println(ob.getName());
        System.out.println(ob.getContacts().get(1).getType());
    }
}
