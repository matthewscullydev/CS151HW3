
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
