/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Student class
 * <p>
 * 
 * This is the Student class which implements the cloneable class. This class contains 
 * String values of department, firstname, and lastname. It also takes int age and float gpa and inherits a super class for course.
 * 
 * </p>
 * 
 */

public class Student implements Cloneable {

	//variables
	
	String firstname;
	String lastname;
	int age;
	float gpa;
	String department;
	private Course course;
	
	
	/**
	 * simple constructor which inherits the course properties from the course object.
	 *
	 */
	public Student(String firstname, String lastname, String department, int age, float gpa, Course course) {
		super();
		this.gpa = gpa;
		this.department = department;
		this.age = age;
		this.lastname = lastname;
		this.firstname = firstname;
		this.course = course;
	}

	//getters setters
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getGpa() {
		return gpa;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	/**
	 *  object clone(). method throws an exception if the clone fails, otherwise
	 * it will assist in cloning the object.
	 *
	 */
	
	protected Object clone() throws CloneNotSupportedException {
		Student student = (Student) super.clone();
		student.course = (Course) course.clone();
		return student;
	}
	
	/**
	 * simple print method
	 *
	 */
	
	public void printInfo(Student student)
	{
		System.out.println(student.firstname);
		System.out.println(student.lastname);
		System.out.println(student.department);
		System.out.println("age = " + student.age);
		System.out.println("gpa = " + student.gpa);
		
		System.out.println();
		
		System.out.println("Course Info:");
		System.out.println(student.course.coursename);
		System.out.println(student.course.description);	
		System.out.println(student.course.department);
		System.out.println(student.course.timestart);
		System.out.println(student.course.weekday);
		
		System.out.println();
		
	}
}
