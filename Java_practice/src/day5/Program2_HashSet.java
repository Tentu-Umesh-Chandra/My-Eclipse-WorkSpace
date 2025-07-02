package day5;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;

public class Program2_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedHashMap maintains the order of set
		//TreeMap will sort the elements in the set
		TreeSet<Integer> setA= new TreeSet<Integer>();
		setA.add(10);
		setA.add(40);
		setA.add(10);
		setA.add(20);
		setA.add(30);
		System.out.println(setA);
		HashSet<Integer> setB = new HashSet<Integer>();
		setB.add(30);
		setB.add(40);
		setB.add(50);
		HashSet<Integer> union = new HashSet<Integer>(setA);
		union.addAll(setB);
		System.out.println(union);
		
		HashSet<Integer> intersection = new HashSet<Integer>(setA);
		intersection.retainAll(setB);
		System.out.println(intersection);
		
		HashSet<Integer> difference = new HashSet<Integer>(setA);
		difference.removeAll(setB);
		System.out.println(difference);
		
		Iterator<Integer> it = setA.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()+":");
		}
	}

}
