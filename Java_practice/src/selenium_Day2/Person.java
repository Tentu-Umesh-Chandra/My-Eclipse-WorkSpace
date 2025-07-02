package selenium_Day2;
import java.util.*;
public class Person implements Comparable{
	int id;
	String name;
	float marks;
	public Person(int id, String name, float marks) {
		super();
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	@Override
	public int compareTo(Object obj) {
		Person p = (Person)obj;
		return this.name.compareTo(p.name);
	}
}
class PersonComparator implements Comparator<Person>{
	@Override
	public int compare(Person p1, Person p2) {
		return Float.compare(p2.marks, p1.marks);
	}
}
