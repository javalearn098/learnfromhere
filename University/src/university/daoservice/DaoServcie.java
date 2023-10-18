package university.daoservice;

import university.students.Student;

public interface DaoServcie {

	 public void displayStudentData();
	 
	 public void saveStudent(Student sutdent);
	 
	 public void updateStudent(Student student);
	 
	 public void deleteStudent(int rollNum);
	
}
