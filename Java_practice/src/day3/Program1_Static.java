package day3;
/*Employee*/
class Employee{
	static {
		System.out.println("I will execute first");
	}
	int  empId;
	String empName;
	private static String companyName = "Cognizant";
	static void print() {
		System.out.println("Hello"+/*empId+*/companyName);
	}
	static class Address{
		String city;
		String country;
		static String pincode;
	}
	void bye() {
		System.out.println(empId+companyName);
	}
}
public class Program1_Static {
	static void sum(int num1,int num2) {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Employee.companyName = "Cognizant";
		//System.out.println(Employee.companyName);
		Employee.print();
		sum(12,13);
		//Employee.bye();
		Employee.Address address = new Employee.Address();
		address.city = "Bangalore";
		Employee.Address.pincode = "12893";
		
	}

}
