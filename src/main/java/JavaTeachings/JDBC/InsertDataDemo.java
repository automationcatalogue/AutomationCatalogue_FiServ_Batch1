package JavaTeachings.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDataDemo {
    public static void main(String[] args) throws SQLException {
        String dburl="jdbc:mysql://localhost:3306/fi_serv_training";
        String dbUserName = "root";
        String dbPassword = "V@shi0807";
        String sql_query="insert into fiservbatch1 values(102,'Manoj',20000,'Chennai'), (103,'Deepak',30000,'Bangalore')";

        Connection con = DriverManager.getConnection(dburl,dbUserName,dbPassword);
        Statement st = con.createStatement();
        int i=st.executeUpdate(sql_query);
        System.out.println("Data insertion is completed for "+i+" rows");
        con.close();

    }
}
