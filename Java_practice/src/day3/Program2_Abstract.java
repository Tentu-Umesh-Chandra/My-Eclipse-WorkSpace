package day3;
abstract class Test{
	void hello() {
		System.out.println("Hello");
	}
	abstract void rating();
}
class TestA extends Test{
	void rating() {
		System.out.println("Bye");
	}
}
public class Program2_Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Test obj = new Test();
	}

}
