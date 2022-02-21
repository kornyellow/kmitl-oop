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

	private String office;
	private int salary;
	private Date date_hired;

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
