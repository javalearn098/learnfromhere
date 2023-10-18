package university.daoserviceimpl;

import java.sql.SQLException;

import university.dao.Dao;
import university.daoimpl.DaoImpl;
import university.daoservice.DaoServcie;
import university.students.Student;

public class DaoServiceImpl implements DaoServcie {

	@Override
	public void displayStudentData() {
		System.out.println("in daoService class: displayStudentData() method..");

		Dao daoImpl = new DaoImpl();

		try {

			daoImpl.showStudents();

		} catch (SQLException e) {
			System.out.println("Exception while reading the data : " + e.getMessage());
		}

	}

	@Override
	public void saveStudent(Student student) {
		System.out.println("in daoService class: saveStudent() method..");

		Dao daoImpl = new DaoImpl();

		daoImpl.addStudent(student);

	}

	@Override
	public void updateStudent(Student student) {

		Dao daoImpl = new DaoImpl();

		daoImpl.updateStudent(student);

	}

	@Override
	public void deleteStudent(int rollNum) {
		// TODO Auto-generated method stub

		Dao daoImpl = new DaoImpl();

		daoImpl.removeStudent(rollNum);
		
	}

	

}
