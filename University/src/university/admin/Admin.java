package university.admin;

import university.daoservice.DaoServcie;
import university.daoserviceimpl.DaoServiceImpl;
import university.students.Student;

public class Admin {

	public static void main(String[] args) {

		//DaoService is an interface and having displayStudentData() method
		//we are creating an object to call the display student method
		DaoServcie daoServiceImpl = new DaoServiceImpl();

		//SAVE STUDENT INTO STUDENT TABLE 
		//Student class is an object
		//daiServicei
       Student student = new Student(108, "ROHIT","MECH","D");
	  // daoServiceImpl.saveStudent(student);

	   //UPDATE student data in db
	   Student updatestudent = new Student(102, "kalyan","CSE","B");
	  // daoServiceImpl.updateStudent(updatestudent);
		
	   //remove the student from db
	  daoServiceImpl.deleteStudent(108);
	   
	   //Show all the students from database
	   daoServiceImpl.displayStudentData();
		
		
	}

}
