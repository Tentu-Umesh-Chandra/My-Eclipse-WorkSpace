package interviewPrep;
//DYNAMIC VS STATIC POLYMORPHISM
//Static classes cannot be overridden
class Parent{
	String house;
	/*static*/ void print() {
		System.out.println("Parent");
	}
}
class child extends Parent{
	String car;
	/*static*/ void print() {
		System.out.println("Child");
	}
}
public class Program3_Polymorphism {

	public static void main(String[] args) {
		//In static case overriding is do not takes place because it is given memory first
		//overriding takes place afterwards while running
		Parent p = new child();
		p.print();
	}

}
