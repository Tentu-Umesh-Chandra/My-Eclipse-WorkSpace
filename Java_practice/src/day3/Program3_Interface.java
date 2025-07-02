package day3;
interface Itest{
	int num1 = 10;
	public final static int num2 = 15;
	public abstract void hello();
	default void bye() {
		System.out.println("BYE");
	}
	static void greet() {
		System.out.println("GREET");
	}
}

class TestA implements Itest{
	public void hello() {
		System.out.println("Hello");
	}
}
public class Program3_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Itest obj = new Itest;
		System.out.println(Itest.num2);
		System.out.println(Itest.greet());
		TestA testA = new TestA();
		testA.hello();
	}

}
