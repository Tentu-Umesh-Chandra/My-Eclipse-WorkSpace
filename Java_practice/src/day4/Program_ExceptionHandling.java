package day4;

public class Program_ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			//int num = 10/0;
			int []arr = {10,20,30};
			System.out.println(arr[10]);
			System.out.println("Bye");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage()+" SPECIFIC EXCEPTION");
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e) {
			System.out.println("GENERIC EXCEPTION");
		}
		//final 
		//finalize 
		//Finally: Block this would always executes even it has exception
		finally {
			System.out.println("I will always execute");
		}
	}

}
