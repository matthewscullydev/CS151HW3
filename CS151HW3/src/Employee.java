/**
 * 
 * @author Matthew Scully
 * @version 1.0
 * @since 3-9-22
 * 
 * Employee class
 * <p>
 * 
 * This is the Employee class takes in the parameters of firstname, lastname, id, and hourlypay.
 * The Employee class has a method for computing pay and multiple associated exceptions. 
 * It also has the capability of being able to clone. 
 * </p>
 * 
 */

public class Employee {

	String firstname;
	String lastname;
	int id;
	int hourlypay;

	// getters

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHourlypay() {
		return hourlypay;
	}

	public void setHourlypay(int hourlypay) {
		this.hourlypay = hourlypay;
	}

	/**
	 * simple computePay method which multiplies hours by pay. This method also has the added
	 * ability to throw exceptions for undesired inputs.
	 * 
	 * @param hours the users inputs which will be multiplied with pay to compute total
	 * @return total pay in float value is returned
	 * @throws NumberFormatException
	 */
	
	public float computePay(int hours) throws NumberFormatException {

		float pay = 0;

		try {
			if (hours > 40) {
				throw new TooManyHoursWorkedException("Too many hrs");

			}

			else if (hours < 0) {
				throw new NumberFormatException();

			} else {
				pay = hours * hourlypay;
				System.out.println(pay);
			}

		}

		catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			System.out.println("hi");
		}

		catch (TooManyHoursWorkedException e) {
			// TODO Auto-generated catch block
			System.out.println("hi");
		}

		return pay;
	}

	
	public Employee(String firstname, String lastname, int id, int hourlypay) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.id = id;
		this.hourlypay = hourlypay;
	}

}
