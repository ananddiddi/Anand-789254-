package ad;

public class Mainapp {
	
	public static void main (String[] args) {
		
		Problem1 emp= new Problem1(789254, "Diddi", "Anand", 30000);
		System.out.println(emp);
		int newSalary= emp.raiseSalary(100);
		emp.setSalary(newSalary);
		System.out.println(emp);
		
		
	}

}
