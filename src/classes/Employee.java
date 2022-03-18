package classes;

import java.util.Date;

public class Employee extends Person {

	public Employee(
		String name,
		String address,
		String phone_number,
		String email_address,
		String office,
		int salary,
		Date date_hired
	) {

		super(name, address, phone_number, email_address);
		this.office = office;
		this.salary = salary;
		this.date_hired = date_hired;
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
	}

	@Override
	public String toString() {

		return super.toString() + " Employee{" +
			"office=" + this.office + ", " +
			"salary=" + this.salary + ", " +
			"date_hired=" + this.date_hired + "}";
	}

	protected String office;
	protected int salary;
	protected Date date_hired;

	public String getOffice() {

		return office;
	}

	public void setOffice(String office) {

		this.office = office;
	}

	public int getSalary() {

		return salary;
	}

	public void setSalary(int salary) {

		this.salary = salary;
	}

	public Date getDateHired() {

		return date_hired;
	}

	public void setDateHired(Date date_hired) {

		this.date_hired = date_hired;
	}
}
