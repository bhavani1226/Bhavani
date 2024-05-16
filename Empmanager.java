package emp.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Empmanager {

	public static void main(String[] args) {
		
		
		String dbURL = "jdbc:mysql://localhost:3306/employeedb";
		String username = "root";
		String password = "Bunny@123#8";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		 
		    if (conn != null) {
		        System.out.println("Connected to the database");
		        conn.close();
		    }
		} catch (SQLException ex) {
			ex.printStackTrace();
		    		

		}
		// TODO Auto-generated method stub

	}

}
