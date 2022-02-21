package classes;

public class Course {

	public Course(String course_name) {

		this.course_name = course_name;
		this.number_of_students = 0;
	}

	public void display() {

		System.out.println("Display course data: ");
		System.out.println("\t- classes.Course Name: " + this.course_name);
		System.out.println("\t- Number of students: " + this.number_of_students);
		System.out.print("\t- Students: ");

		if (this.students != null) {

			System.out.print("\n");
			for (String student : this.students) System.out.println("\t\t- " + student);

		} else System.out.println("-");
	}

	public void addStudent(String student_name) {

		if (this.students == null) {

			this.students = new String[1];
			this.students[0] = student_name;
			this.number_of_students = 1;
			return;
		}

		String[] old_students = this.students;
		this.students = new String[++this.number_of_students];

		System.arraycopy(old_students, 0, this.students, 0, old_students.length);
		this.students[this.students.length - 1] = student_name;
	}

	public void dropStudent(String student_name) {

		if (this.students == null) return;

		int delete_index = -1;
		for (int i = 0; i < this.students.length; i++)
			if (this.students[i].equals(student_name)) delete_index = i;

		if (delete_index == -1) return;

		while (delete_index != this.students.length - 1) {

			this.students[delete_index] = this.students[delete_index + 1];
			delete_index++;
		}
		this.number_of_students--;

		if (this.number_of_students == 0) {
			this.students = null;
			return;
		}

		String[] new_student = new String[this.number_of_students];

		System.arraycopy(this.students, 0, new_student, 0, this.number_of_students);
		this.students = new_student;
	}

	public void clearStudent() {

		if (this.students == null) return;

		this.students = null;
		this.number_of_students = 0;
	}

	private final String course_name;
	private String[] students;
	private int number_of_students;

	public String getCourseName() {

		return this.course_name;
	}

	public String[] getStudents() {

		return this.students;
	}

	public int getNumberOfStudents() {

		return this.number_of_students;
	}
}
