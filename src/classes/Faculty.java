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

	private Time office_hours;
	private int rank;

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
