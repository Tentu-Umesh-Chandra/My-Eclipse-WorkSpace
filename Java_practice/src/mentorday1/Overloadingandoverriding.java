package mentorday1;
//Overloading
class loading{
	int overload(int a, int b) {
		return a+b;
	}
	int overload(int a,int b, int c) {
		return a*b*c;
	}
}

//overriding
class riding{
	void print() {
		System.out.println("Hello User: ");
	}
}
class riding1 extends riding{
	//@Override
	void print() {
		System.out.println("Welcome User: ");
	}
}
class riding2 extends riding{
	//@Override
	void print() {
		System.out.println("Welcome Umesh: ");
	}
}

public class Overloadingandoverriding {
	int overload(int a, int b) {
		return a+b;
	}
	int overload(int a,int b, int c) {
		return a*b*c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloadingandoverriding over = new Overloadingandoverriding();
		
		//@Overloading
		//System.out.println("Addition "+over.overload(10, 20));
		//System.out.println("Multiply "+over.overload(10, 20, 2));
		
		loading load = new loading();
		System.out.println("Addition "+load.overload(10, 20));
		System.out.println("Multiply "+load.overload(10, 20, 2));
		
		
		//@Overriding
		riding r = new riding();
		r.print();
		riding1 r1= new riding1();
		riding2 r2= new riding2();
		r1.print();
		r2.print();
	}
}
