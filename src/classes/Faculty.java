package classes;

import java.sql.Time;
import java.util.Date;

public class Faculty extends Employee {

	public Faculty(
		String name,
		String address,
		String phone_number,
		String email_address,
		String office,
		int salary,
		Date date_hired,
		Time office_hours,
		int rank
	) {

		super(name, address, phone_number, email_address, office, salary, date_hired);
		this.office_hours = office_hours;
		this.rank = rank;
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
		System.out.println("Office hour: " + this.office_hours);
		System.out.println("Rank: " + this.rank);
	}

	@Override
	public String toString() {

		return super.toString() + " Faculty{" +
			"office_hour=" + this.office_hours + ", " +
			"rank=" + this.rank + "}";
	}

	protected Time office_hours;
	protected int rank;

	public Time getOfficeHours() {

		return office_hours;
	}

	public void setOfficeHours(Time office_hours) {

		this.office_hours = office_hours;
	}

	public int getRank() {

		return rank;
	}

	public void setRank(int rank) {

		this.rank = rank;
	}
}
