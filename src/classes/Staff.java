package classes;

import java.util.Date;

public class Staff extends Employee {

	public Staff(
		String name,
		String address,
		String phone_number,
		String email_address,
		String office,
		int salary,
		Date date_hired,
		String title
	) {

		super(name, address, phone_number, email_address, office, salary, date_hired);
		this.title = title;
	}

	@Override
	public void display() {

		System.out.println("Employee");
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.phone_number);
		System.out.println("Email: " + this.email_address);
		System.out.println("Office: " + this.office);
		System.out.println("Salary: " + this.salary);
		System.out.println("Date hired: " + this.date_hired);
		System.out.println("Title: " + this.title);
	}

	@Override
	public String toString() {

		return super.toString() + " Staff{" +
			"title=" + this.title + "}";
	}

	protected String title;

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}
}
