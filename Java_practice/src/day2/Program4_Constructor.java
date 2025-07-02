package day2;
class Parent{
	String house;
	void print() {
		System.out.println("Hello");
	}
	Parent(){
		System.out.println("I am parent");
	}
}

class Child extends Parent{
	String car;
	void print() {
		System.out.println("Bye");
	}
	Child(){
		System.out.println("I am child");
	}
}

public class Program4_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		child.print();
	}
}