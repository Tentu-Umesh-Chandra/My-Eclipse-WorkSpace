package day3;
interface TouchScreen{
	
}
class FingerPrint{
	
}
class Mobile extends FingerPrint implements TouchScreen{
	
}
interface ItestA{
	int num = 10;
	void hello();
}
interface ItestB{
	int num = 20;
	void bye();
}
class TestC implements ItestA,ItestB{
	public void hello() {
		System.out.println("Hello"+this.num);
	}
	public void bye() {
		System.out.println("Bye");
	}
}
public class Program4_multiInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
