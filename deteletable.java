package task1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class deteletable {
	

		public static void main(String[] args)
		{
			try {
			//load and register register
			Class.forName("org.postgresql.Driver");
			String url="jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
			Connection connection=DriverManager.getConnection(url);
			String sql="drop table product";
			Statement statement =connection.createStatement();
			statement.execute(sql);
			System.out.println("Table has been  droped ");
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


