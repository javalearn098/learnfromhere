package university.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbConfig {

	/*
	 * public static void main(String args[]) { try {
	 * Class.forName("com.mysql.jdbc.Driver"); Connection con =
	 * DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root",
	 * "root"); // here university is database name, root is username and password
	 * Statement stmt = con.createStatement();
	 * 
	 * //INSERT DATA INTO DB String insertQuery =
	 * "INSERT INTO student_table(name,dept,grade,rollNum) " +
	 * "VALUES ('jhon', 'ECE', 'D',104)"; int executeUpdate =
	 * stmt.executeUpdate(insertQuery);
	 * 
	 * String updateQuery = "update student_table set name='jhon abc' where id=7";
	 * int executeUpdate2 = stmt.executeUpdate(updateQuery);
	 * 
	 * String deleteQuery = "delete from student_table where id=7"; int
	 * executeUpdate3 = stmt.executeUpdate(deleteQuery);
	 * 
	 * //READING DATA FROM DB ResultSet rs =
	 * stmt.executeQuery("select * from student_table"); while (rs.next())
	 * System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " +
	 * rs.getString(3)+" "+ rs.getString(4)+" "+rs.getString(5)); con.close(); }
	 * catch (Exception e) { System.out.println(e); } } }
	 */

	// RETURNS THE DB CONNECTION
	public Connection getConnection() {

		Connection con = null;

		try {
			// load the driver
			Class.forName("com.mysql.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "root");

		} catch (Exception e) {
			System.out.println("Exception while connecting to DB : " + e.getMessage());
		}

		return con;
	}
}
