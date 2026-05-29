package task1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.Date;


public class Dynamicdatastore {
	public static void main(String[] args)
	{
		try {
		//load and register register
		Class.forName("org.postgresql.Driver");
		String url="jdbc:postgresql://localhost:5432/learning_adv_java?user=postgres&password=root";
		Connection connection=DriverManager.getConnection(url);

		String sql="insert into student values(?,?,?,?,?,?)";
	    PreparedStatement ps=connection.prepareStatement(sql);
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter ID : ");
//	    int id=sc.nextInt();
//	    ps.setInt(1, id); or
	    ps.setInt(1,sc.nextInt());
	    System.out.println("Enter Name : ");
	    ps.setString(2,sc.next());
	    System.out.println("Enter your weight : ");
	    ps.setDouble(3, sc.nextDouble());
	    System.out.println("Enter your MStatus");
	    ps.setBoolean(4, sc.nextBoolean());
	    System.out.println("Enter your DOB :");
	    String date=sc.next();
	    ps.setDate(5,Date.valueOf(date));
	    System.out.println("Enter your Mobile No : ");
	    ps.setLong(6,sc.nextLong());
	    ps.execute();
	    System.out.println("the data has been inserted");
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
