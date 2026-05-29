package task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class altertable {
	//alter the structure of the column

    public static void main(String[] args) {

        try {

            // Load Driver
            Class.forName("org.postgresql.Driver");

            // Connection
            String url = "jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";

            Connection connection = DriverManager.getConnection(url);

            // SQL Query
            String sql = "ALTER TABLE product ADD PRIMARY KEY (productid)";

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















































//package task1;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class altertable {
//	
//	         public static void main(String[] args)
//				{
//					try {
//					//load and register register
//					Class.forName("org.postgresql.Driver");
//					String url="jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
//					Connection connection=DriverManager.getConnection(url);
//					String sql="alter table product modify productid primary key";
//							
//		
//					Statement statement =connection.createStatement();
//					statement.execute(sql);
//					System.out.println("table is updated ");
//					connection.close();
//					}
//					catch(ClassNotFoundException e) {
//						e.printStackTrace();
//						
//					}
//					catch(SQLException e) {
//						e.printStackTrace();
//						
//					}
//					
//				}
//
//			}




		




