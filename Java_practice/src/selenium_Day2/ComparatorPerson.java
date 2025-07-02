package selenium_Day2;
import java.util.*;
public class ComparatorPerson {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(101,"Umesh",98.5f);
		Person p2 = new Person(102,"Muneeb",91.3f);
		Person p3 = new Person(103,"Deepak",88.9f);
		ArrayList<Person>list = new ArrayList<Person>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		Collections.sort(list);
		for(Person p:list) {
			System.out.println(p.getName());
		}
	}
}
