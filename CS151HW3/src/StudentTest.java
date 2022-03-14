/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * StudentTest class
 * <p>
 * 
 * This is the StudentTest class which creates a course, student, and empty second student. 
 * It then clones the first student into the empty student as instructed.
 * </p>
 * 
 */

public class StudentTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Course course1 = new Course("CS151", "Object Oriented Design and Programming", "CS", "6:00 PM", "Tue");
	Student student1 = new Student("John", "Smith", "CS", 20, (float)3.6, course1);
	Student student2 = null;
	
	
	student1.printInfo(student1);
	
	//copy class now
		try {
		student2 = (Student) student1.clone();
		}
		catch (CloneNotSupportedException e)
		{
		e.printStackTrace();
		}

	student2.printInfo(student2);
		
	}
	
}
