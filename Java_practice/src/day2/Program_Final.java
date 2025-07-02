package day2;
class Test{
	final String batchCode = "123";
	/*final*/ void print() {
		System.out.println("Hello");
	}
}

/*final*/ class Student{
	
}
class StudentA extends Student{
	
}
//A final class cannot be Inhered by any subclass

class TestA extends Test{
	void print() {
		System.out.println("Bye");
	}
	//A Method once called as final cannot be called or modifiable in its subclasses
}
public class Program_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test obj = new Test();
		obj.print();
	}
}