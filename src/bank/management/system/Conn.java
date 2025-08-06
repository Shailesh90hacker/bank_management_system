package bank.management.system;

//step 1 -> Importing required packages
//step 2 -> Load JDBC Drivers  ( In Modern JDBC (Java 6+), this step is optional.  MySQL JDBC driver auto-registers itself.)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
    Connection connection;
    Statement statement;

    public Conn(){
        try{
//step 3 -> Establish a Connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","Shailesh@786");
//Step 4: Create Statement
            statement = connection.createStatement();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
// Step 4: Execute SQL Queries
// Step 5: Process the Result

}
