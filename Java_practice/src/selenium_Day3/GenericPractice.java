package selenium_Day3;
import java.util.ArrayList;
class Test<T>{
	T obj;
	Test(T obj){
		this.obj = obj;
	}
	void print() {
		System.out.println("Hello "+this.obj);
	}
	void printList(ArrayList<?>array) {
		for(Object num:array) {
			System.out.println(num);
		}
	}
}
public class GenericPractice {
	public static void main(String[] umesh) {
		// TODO Auto-generated method stub
		Test<Integer> test = new Test<Integer>(10);
		test.print();
		Test<String> test2 = new Test<String>("Bye");
		test2.print();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		test.printList(list);
	}
}