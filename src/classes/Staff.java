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

	String title;

	public String getTitle() {

		return title;
	}

	public void setTitle(String title) {

		this.title = title;
	}
}
