package JavaTeachings.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadDBData {
    public static void main(String[] args) throws Exception{

        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/fi_serv_training","root","V@shi0807");
        System.out.println("Communication is successful");
        Statement st=con.createStatement();
        ResultSet rs=st.executeQuery("select * from login_credentials");

        while(rs.next()){
            String userName=rs.getString(1);
            String password=rs.getString(2);
            System.out.println(userName+"\t"+password);
        }
        con.close();


    }
}
