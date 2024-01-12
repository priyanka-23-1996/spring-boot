package jdbcExample.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import jdbcExample.entity.Student;

public class StudentDaoImpl {
	public  void saveStu(Student s) {
		try {
			//jdbc:mysql://localhost:3306/foody
			String url = "jdbc:mysql://localhost:3306/foody"; // table details
			String username = "root"; // MySQL credentials
			String password = "root";
			String query = "insert into student(id,name,number)  " + "values(?,?,?);";// query
																														// to
			Class.forName("com.mysql.cj.jdbc.Driver"); // Driver name
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("Connection Established successfully");
			PreparedStatement st = con.prepareStatement(query);
			st.setInt(1, s.getId());
			st.setString(2, s.getName());
			st.setLong(3, s.getNumber());
			
			int noRows = st.executeUpdate(query); // Execute query

			System.out.println(noRows); // Print result on console
			st.close(); // close statement
			con.close(); // close connection
			System.out.println("Connection Closed....");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}