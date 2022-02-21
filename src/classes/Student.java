package classes;

public class Student extends Person {

	public final int FRESHMAN = 0;
	public final int SOPHOMORE = 1;
	public final int JUNIOR = 2;
	public final int SENIOR = 3;

	public Student(
		String name,
		String address,
		String phone_number,
		String email_address,
		int status
	) {

		super(name, address, phone_number, email_address);
		this.status = status;
	}

	private int status;

	public int getStatus() {

		return this.status;
	}

	public void setStatus(int status) {

		this.status = status;
	}
}
