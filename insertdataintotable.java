package task1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class insertdataintotable {

          public static void main(String[] args)
			{
				try {
				//load and register register
				Class.forName("org.postgresql.Driver");
				String url="jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
				Connection connection=DriverManager.getConnection(url);
				String sql="insert into product values(104,'eyeliner',400.0)";
				Statement statement =connection.createStatement();
				statement.execute(sql);
				System.out.println("data has been insert ");
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




	

