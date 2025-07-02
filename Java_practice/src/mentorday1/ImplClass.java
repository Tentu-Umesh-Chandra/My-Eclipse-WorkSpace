package mentorday1;
//Interface class example;
interface inter{
	void print();
}
class testClass implements inter{
	public void print(){
		System.out.println("Hi! Iam Umesh");
	}
}
public class ImplClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testClass imp = new testClass();
		imp.print();
	}

}
