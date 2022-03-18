package classes;

public class Student extends Person {

	public static final String FRESHMAN = "FRESHMAN";
	public static final String SOPHOMORE = "SOPHOMORE";
	public static final String JUNIOR = "JUNIOR";
	public static final String SENIOR = "SENIOR";

	public Student(
		String name,
		String address,
		String phone_number,
		String email_address,
		String status
	) {

		super(name, address, phone_number, email_address);
		this.status = status;
	}

	@Override
	public void display() {

		System.out.println("Student");
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.phone_number);
		System.out.println("Email: " + this.email_address);
		System.out.println("Status: " + this.status);
	}

	@Override
	public String toString() {

		return super.toString() + " Student{" +
			"status=" + this.status + "}";
	}

	protected String status;

	public String getStatus() {

		return this.status;
	}

	public void setStatus(String status) {

		this.status = status;
	}
}
