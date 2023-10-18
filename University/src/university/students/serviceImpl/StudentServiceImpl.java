package university.students.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import university.students.Student;
import university.students.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentsByName(ArrayList<Student> studentRecords, String name) {

		for (int i = 0; i < studentRecords.size(); i++) {

			Student student = studentRecords.get(i);
			if (student.getName().equalsIgnoreCase(name)) {

				return student;

			}

		}

		return null;
	}

	@Override
	public Student getStudentsById(ArrayList<Student> studentRecords, int rollNum) {

		for (int i = 0; i < studentRecords.size(); i++) {

			Student student = studentRecords.get(i);

			if (student.getRollNum() == rollNum) {

				return student;

			}

		}

		return null;
	}

	@Override
	public List<Student> getStudentsByDept(ArrayList<Student> studentRecords, String deptname) {

		System.out.println("inside  getStudentsByDept method().....");

		List<Student> studentListResponse = new ArrayList<>();

		System.out.println("Before the loop...");
		for (int i = 0; i < studentRecords.size(); i++) {

			if (studentRecords.get(i).getDept().equalsIgnoreCase(deptname)) {

				studentListResponse.add(studentRecords.get(i));
			}

		}

		System.out.println("After the loop...");

		return studentListResponse;
	}

	@Override
	public boolean verifyStudentExistInCSEDept(ArrayList<Student> studentRecords, int rollNum) {

		StudentServiceImpl studentServiceImpl = new StudentServiceImpl();

		List<Student> studentsByDept = studentServiceImpl.getStudentsByDept(studentRecords, "CSE");

		Student studentsById = studentServiceImpl.getStudentsById(studentRecords, rollNum);

		if (studentsByDept.contains(studentsById)) {

			return true;
		}

		return false;
	}

	@Override
	public List<String> studentNames(ArrayList<Student> studentRecords) {

		List<String> studentNames = new ArrayList<>();

		if (studentRecords != null && !studentRecords.isEmpty()) {
			studentRecords.get(0);

			for (int i = 0; i < studentRecords.size(); i++) {

				studentNames.add(studentRecords.get(i).getName());

			}
		}

		return studentNames;
	}

	@Override
	public boolean verifyStudentNameExists(List<String> studentNames) {

		boolean check = false;

		System.out.println("Enter Student Name :");

		Scanner sc = new Scanner(System.in);

		String userInput = sc.next();

		if (studentNames.contains(userInput)) {

			check = true;
			System.out.println("Student exist you can get the details soon......");
		} else {
			System.out.println("Not student witht the provided details exist in our records....");
		}
		return check;
	}

	@Override
	public String deleteStudent(List<String> studentNames) {
		String message ="";
		
		System.out.println("BEFORE REMOVE");
		System.out.println(studentNames);
		
		System.out.println("Enter Student Name :");

		Scanner sc = new Scanner(System.in);//accepts input from system

		String userInput = sc.next();
		
		
		boolean removeFlag = studentNames.remove(userInput);
		
		if(removeFlag) {
			 message ="Student removed successfully....";
		}else {
		
			 message ="There is no such name to delete.Please provide a valid input";
		}
		
		System.out.println("AFTTER  REMOVE");
		System.out.println(studentNames);
		return message;
	}

}
