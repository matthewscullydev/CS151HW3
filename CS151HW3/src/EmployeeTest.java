/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * EmployeeTest class
 * <p>
 * 
 * This is the EmployeeTest class which is used to compute pay and print any exceptions if relevant.
 * </p>
 * 
 */
public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee john = new Employee("John", "Smith", 101, 35);

		john.computePay(40);
		john.computePay(21);
		john.computePay(1);
		john.computePay(0);
		john.computePay(-5);
		john.computePay(45);

	}

}
