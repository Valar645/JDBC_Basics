package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Deleterow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.postgresql.Driver");

			String url = "jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
			Connection connection=DriverManager.getConnection(url);
			String sql="delete from product where productid=103";
			Statement statement=connection.createStatement();
			statement.execute(sql);
			System.out.println("row has been deleted ");
			connection.close();
			
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}

	}

}
