package ad;

public class Problem1 {
	int id;
	String firstName;
	String lastName;
	int salary;
	
	public Problem1(int id, String firstName, String lastName, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		setSalary (salary);
		

		
		
	}
	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return firstName + lastName;
		
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
		
	}
	public int getAnnualSalary() {
		return salary*12;
		
	}
	public int raiseSalary (int percent) {
		return salary*(1+percent/100);
		
		
		
	}
	@Override
	public String toString() {
		return "Problem1 [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}
	
	
	
	
	
	

}
