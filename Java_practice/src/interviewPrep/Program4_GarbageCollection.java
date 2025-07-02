package interviewPrep;
class Student{
	
}
public class Program4_GarbageCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		
		//s1 is eligible for garbage collection
		Student s2=s1;
		
		//s3 is eligible for garbage collection
		Student s3=null;
		
		
	}

}
