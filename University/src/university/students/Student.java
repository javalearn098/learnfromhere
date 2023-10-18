package university.students;

public class Student {

	private int rollNum;

	private String name;

	private String dept;

	private String grade;
	
	public Student(){
		
	}
	
	public Student(int rollNum, String name, String dept, String grade) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.dept = dept;
		this.grade = grade;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", dept=" + dept + ", grade=" + grade + "]";
	}

}
