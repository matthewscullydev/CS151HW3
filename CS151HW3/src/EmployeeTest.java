
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
