package day4;

public class Program_Throw {
	static void checkAge(int age) throws Exception{
		if(age >=18) {
			
		}
		else {
			Exception e = new Exception("UNDERAGE");
			throw e;
		}
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		checkAge(17);
	}

}
