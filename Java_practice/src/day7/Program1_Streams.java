package day7;
import java.util.*;
import java.util.stream.Collectors;
//Stream uses 2 methods. It uses lambda expressions 
//intermediate methods, and ternary methods
//.sorted(Comparator.comparingInt(Student::getRollNo))
//.sorted(Comparator.comparingInt(s->s.getRollNo()))
//filter() this method us used to filter the things we want to.
class Student{
	int rollNo;
	String name;
	public Student(int rollNo,String name){
		this.rollNo = rollNo;
		this.name = name;
	}
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
	
	public boolean equals(Object obj) {
		Student student = (Student)obj;
		if(this==obj) return true;
		else if(obj==null || getClass()!=obj.getClass()) return false;
		else return Objects.equals(name, student.getName());
	}
	public int hashCode() {
		return Objects.hash(name);
	}
}
public class Program1_Streams {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> lis= new ArrayList<>();
		Student s1 = new Student(1,"Umesh");
		Student s2 = new Student(2,"Umesh");
		Student s3 = new Student(3,"Sita");
		
		lis.add(s1);
		lis.add(s2);
		lis.add(s3);
		List<Student> sortedList = lis.stream().sorted(Comparator.comparingLong(Student::getRollNo)).collect(Collectors.toList());
		
		sortedList.stream().forEach(s->System.out.println(s.getName()));
		/*
		for(Student s:sortedList) {
			System.out.println(s.getName()+" "+s.getRollNo());
		}
		*/
		
		//printing the rollNo's of students whose rollNo's are >1 using filter method
		List<Student> filteredResult = lis.stream().filter(s->s.getRollNo()>1).collect(Collectors.toList());
		filteredResult.stream().map(Student::getRollNo).forEach(System.out::println);//map function is used to print only rollNo
		
		//reduce() method is a terminal method where we wanna print single output & in our case max rollNo
		Optional<Integer> maxRollNo = lis.stream().map(Student::getRollNo).reduce(Integer::max);
		System.out.println("Maximum Roll No: "+maxRollNo.get());
		
		//distinct() method used to return diff elements
		List<Student> dis= lis.stream().distinct().collect(Collectors.toList());
		dis.stream().forEach(s->System.out.println(s.getName()));

 	}
}
