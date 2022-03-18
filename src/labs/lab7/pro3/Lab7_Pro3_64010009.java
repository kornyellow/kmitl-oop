package labs.lab7.pro3;

import classes.*;

import java.sql.Time;
import java.util.Date;

public class Lab7_Pro3_64010009 {

	public static void main(String[] args) {

		Person person = new Person(
			"Korn",
			"12/15 Serithai 55 Bangkok 10240",
			"084-228-7850",
			"kornkubzaza@hotmail.com"
		);
		person.display();
		System.out.println(person);
		System.out.println();

		Student student = new Student(
			"Korn",
			"12/15 Serithai 55 Bangkok 10240",
			"084-228-7850",
			"kornkubzaza@gmail.com",
			Student.FRESHMAN
		);
		student.display();
		System.out.println(student);
		System.out.println();

		Employee employee = new Employee(
			"Korn",
			"12/15 Serithai 55 Bangkok 10240",
			"084-228-7850",
			"kornkubzaza@gmail.com",
			"KMITL",
			20000,
			new Date()
		);
		employee.display();
		System.out.println(employee);
		System.out.println();

		Faculty faculty = new Faculty(
			"Korn",
			"12/15 Serithai 55 Bangkok 10240",
			"084-228-7850",
			"kornkubzaza@gmail.com",
			"KMITL",
			20000,
			new Date(),
			new Time(1000000),
			1
		);
		faculty.display();
		System.out.println(faculty);
		System.out.println();

		Staff staff = new Staff(
			"Korn",
			"12/15 Serithai 55 Bangkok 10240",
			"084-228-7850",
			"kornkubzaza@gmail.com",
			"KMITL",
			20000,
			new Date(),
			"Master"
		);
		staff.display();
		System.out.println(staff);
		System.out.println();
	}
}