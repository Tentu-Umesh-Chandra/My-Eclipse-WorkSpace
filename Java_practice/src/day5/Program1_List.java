package day5;
import java.util.*;
class Student{
	int rollNo;
	String name;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	
}
public class Program1_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> list = new ArrayList<Student>();
		Student s1 = new Student(10,"Rajat");
		Student s2 = new Student(11,"Rahul");
		Student s3 = new Student(12,"Shreya");
		list.add(s1);
		list.add(s2);
		list.add(s3);
		for(Student s:list) {
			System.out.println(s.getRollNo()+" "+s.getName());
		}
		System.out.println(list.get(0));
		System.out.println(list.contains(s3));
		System.out.println(list.indexOf(s3));
		System.out.println(list.size());
		list.remove(0);
		list.get(0).setRollNo(13);
		for(Student s:list) {
			System.out.println(s.getRollNo()+" "+s.getName());
		}
	}

}
