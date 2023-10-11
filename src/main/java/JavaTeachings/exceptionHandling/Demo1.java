package JavaTeachings.exceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Demo1 {
    public static void main(String[] args) {
        FileInputStream ob;
        try{
            ob = new FileInputStream("C:\\Users\\AaradhyaVashisht\\Desktop\\abcd.pdf");
            System.out.println("File is opened in a read mode");
        }catch(FileNotFoundException ob1){
            System.out.println("File is not present in the specified location");
        }finally {

        }

    }
}
