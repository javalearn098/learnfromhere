package university.students.service;

import java.util.ArrayList;
import java.util.List;

import university.students.Student;

public interface StudentService {

	Student getStudentsByName(ArrayList<Student> studentRecords, String name);

	Student getStudentsById(ArrayList<Student> studentRecords, int rollNum);

	List<Student> getStudentsByDept(ArrayList<Student> studentRecords, String deptname);

	boolean verifyStudentExistInCSEDept(ArrayList<Student> studentRecords, int rollNum);

	List<String> studentNames(ArrayList<Student> studentRecords);
	
	boolean verifyStudentNameExists(List<String> studentRecords);
	
	String deleteStudent(List<String> studentRecords);
}
