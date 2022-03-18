package classes;

public class Person {

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

	public void display() {

		System.out.println("Person");
		System.out.println("Name: " + this.name);
		System.out.println("Address: " + this.address);
		System.out.println("Phone: " + this.phone_number);
		System.out.println("Email: " + this.email_address);
	}

	@Override
	public String toString() {

		return "Person{" +
			"name=" + this.name + ", " +
			"address=" + this.address + ", " +
			"email=" + this.email_address + "}";
	}

	protected String name;
	protected String address;
	protected String phone_number;
	protected String email_address;

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
