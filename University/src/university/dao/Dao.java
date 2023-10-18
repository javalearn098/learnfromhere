package university.dao;

import java.sql.SQLException;

import university.students.Student;

public interface Dao {

	 void addStudent(Student student);
	 
	 void updateStudent(Student student);
	 
	 void showStudents() throws SQLException;
	 
	 void removeStudent(int rollNum);
	
}
