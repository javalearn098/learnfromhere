package university.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import university.dao.Dao;
import university.dbconfig.DbConfig;
import university.students.Student;

public class DaoImpl implements Dao {

	@Override
	public void addStudent(Student student) {
		System.out.println("in addstudent() method ");
		DbConfig dbConfig = new DbConfig();
		Connection connection = dbConfig.getConnection();
		PreparedStatement preparedStatement = null;

		String insertQuery = "insert into student_table(name,dept,grade,rollNum) values(?,?,?,?)";
		try {
			preparedStatement = connection.prepareStatement(insertQuery);

			preparedStatement.setString(1, student.getName());
			preparedStatement.setString(2, student.getDept());
			preparedStatement.setString(3, student.getGrade());
			preparedStatement.setInt(4, student.getRollNum());

			int executeUpdate = preparedStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("Student saved successfully........");
			} else {
				System.out.println("Student Not  saved!");
			}
		} catch (SQLException e) {

			System.out.println("Exception while save data :" + e.getMessage());
		}

	}

	@Override
	public void updateStudent(Student student) {
		System.out.println("in Update student() method .......");

		//DB connection
		DbConfig dbConfig = new DbConfig();
		Connection connection = dbConfig.getConnection();
		//initiallly taking null for prepare statement
		PreparedStatement preparedStatement = null;
       Statement stmt = null;
		//String updateQuery = "update student_table set grade = ? where  id = 4";
       
       String updateQuery = "update student_table set grade = "+student.getGrade()+" where  id = 4";
       String testQuery = String.format("update student_table set grade ='%s' where  id = 4",student.getGrade());
		try {
			
			//Using statement
			stmt = connection.createStatement();
			  int executeUpdate2 = stmt.executeUpdate(testQuery);
			  if(executeUpdate2 >0) {
				  System.out.println("updation success using statement");
				  
			  }else {
				  System.out.println("updation  using statement");
			  }
			 
			
			//initializing the prepare statement
			preparedStatement = connection.prepareStatement(updateQuery);
			
			//setting the query params
			preparedStatement.setString(1, student.getGrade());
			//preparedStatement.setInt(2, 4);

			//   returns int i.e number of rows effected   =   excecuting the query
			int executeUpdate = preparedStatement.executeUpdate(updateQuery);

			//checking if rows greater than 0 then return success
			if (executeUpdate > 0) {
				System.out.println("Student updated successfully..........");
			}else {
				System.out.println("Student updation Failed..........");
			}
		} catch (Exception e) {

			System.out.println("Error while updating student data : "+e.getMessage());
		}

	}

	@Override
	public void showStudents() throws SQLException {
		System.out.println("in show student() method ");

		DbConfig dbConfig = new DbConfig();

		Connection connection = dbConfig.getConnection();
		Statement createStatement = null;
		ResultSet result = null;
		try {
			createStatement = connection.createStatement();
			result = createStatement.executeQuery("select * from student_table");
			System.out.println("Student Details");
			while (result.next()) {

				System.out.println("Id " + result.getInt(1) + " Name : " + result.getString(2) + " Dept : "
						+ result.getString(3) + " Grade " + result.getString(4) + " RollNum :" + result.getInt(5));

			}

		} catch (SQLException e) {
			System.out.println("Error while reading the data from DB :" + e.getMessage());
		}

		finally {
			connection.close();
		}

	}

	@Override
	public void removeStudent(int rollNum) {

		System.out.println("in Delete student() method : ");
		DbConfig dbConfig = new DbConfig();
		Connection connection = dbConfig.getConnection();
		PreparedStatement preparedStatement = null;

		String deleteQuery = "delete from student_table where rollNum = ?";
		try {
			preparedStatement = connection.prepareStatement(deleteQuery);

			preparedStatement.setInt(1, rollNum);

			int executeUpdate = preparedStatement.executeUpdate();

			if (executeUpdate > 0) {
				System.out.println("Student removed successfully........");
			} else {
				System.out.println("Student Not removed  saved!");
			}
		} catch (SQLException e) {

			System.out.println("Exception while save data :" + e.getMessage());
		}


	}

}
