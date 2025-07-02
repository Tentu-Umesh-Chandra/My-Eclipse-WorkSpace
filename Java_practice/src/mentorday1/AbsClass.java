package mentorday1;
abstract class Test{
	void hello() {
		System.out.println("Hola!");
	}
	abstract void bye();
}
class TestA extends Test{
	void bye() {
		System.out.println("Adios! Hasta Manyana");
	}
}

public class AbsClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestA te= new TestA();
		te.bye();
		te.hello();
	}
}
