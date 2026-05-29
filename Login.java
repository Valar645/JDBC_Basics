package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connection
            String url = "jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";

            Connection connection = DriverManager.getConnection(url);
            // SQL Query
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter your Username : ");
            String un=sc.next();
            System.out.println("Enter any password : ");
            String pswd=sc.next();
                   
           
            String sql = "select * from login where username='"
            		+ un+"' and password='"+ pswd +"'";

            // Execute
            Statement statement = connection.createStatement();
            statement.execute(sql);
            ResultSet rs =statement.getResultSet();
            if(rs.next()) {
            	System.out.println("Logged in Successfully");
            }
            else {
            	System.out.println("Logged in Failed");
            	System.out.println("incorrect  UN or PSWD");
            }

         

            connection.close();

        } 
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
