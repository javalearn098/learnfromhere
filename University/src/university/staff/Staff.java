package university.staff;

public class Staff {

	private int staffId;

	private String name;

	private String email;

	private String subject;

	private float salary;

	public Staff(int staffId, String name, String email, String subject, float salary) {
		super();
		this.staffId = staffId;
		this.name = name;
		this.email = email;
		this.subject = subject;
		this.salary = salary;
	}

	public int getStaffId() {
		return staffId;
	}

	public void setStaffId(int staffId) {
		this.staffId = staffId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Staff [staffId=" + staffId + ", name=" + name + ", email=" + email + ", subject=" + subject
				+ ", salary=" + salary + "]";
	}

}
