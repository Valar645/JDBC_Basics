package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Readdata {
	public static void main(String[] args) {
		//load or register driver
		try {
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
			//Establish connection
			Connection connection=DriverManager.getConnection(url);
			//prepare statement
			String sql="select * from product";
			Statement statement=connection.createStatement();
			//execute statement
			statement.execute(sql);
			
			//result set to get the data
			ResultSet rs=statement.getResultSet();
			System.out.println("productid\tname\tprice");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " \t"+
						           rs.getString(2)+ " \t"+
						           rs.getDouble(3));
				
			}
			//close connection
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
