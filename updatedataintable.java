package task1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class updatedataintable {
	//update the value in the table

	    public static void main(String[] args) {

	        try {

	            // Load Driver
	            Class.forName("org.postgresql.Driver");

	            // Connection
	            String url = "jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";

	            Connection connection = DriverManager.getConnection(url);

	            // SQL Query
	            String sql = "update  product set name='moisturizer' where productid=102";

	            // Execute
	            Statement statement = connection.createStatement();
	            statement.execute(sql);

	            System.out.println("Table updated successfully");

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



