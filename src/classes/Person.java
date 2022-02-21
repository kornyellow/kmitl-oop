package classes;

public class Person {

	private String name;
	private String address;
	private String phone_number;
	private String email_address;

	public Person(
		String name,
		String address,
		String phone_number,
		String email_address
	) {

		this.name = name;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}

	@Override
	public String toString() {

		String str = getClass().getName();
		System.out.println(str);

		return str;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {

		this.name = name;
	}

	public String getAddress() {

		return address;
	}

	public void setAddress(String address) {

		this.address = address;
	}

	public String getPhoneNumber() {

		return phone_number;
	}

	public void setPhoneNumber(String phone_number) {

		this.phone_number = phone_number;
	}

	public String getEmailAddress() {

		return email_address;
	}

	public void setEmailAddress(String email_address) {

		this.email_address = email_address;
	}
}
