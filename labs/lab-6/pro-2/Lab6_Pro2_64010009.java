public class Lab6_Pro2_64010009 {

	public static void main(String[] args) {

		Course course = new Course("Object-Oriented-Programming");
		course.addStudent("Korn");
		course.addStudent("Jame");
		course.addStudent("Aom");

		course.dropStudent("Jame");

		course.display();
	}
}
