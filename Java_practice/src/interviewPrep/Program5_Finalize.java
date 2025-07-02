package interviewPrep;
//We cannot override finalize class
class Test{
	protected void finalize() {
		System.out.println("Finalize is called");
	}
}
public class Program5_Finalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		obj.finalize();
	}

}
