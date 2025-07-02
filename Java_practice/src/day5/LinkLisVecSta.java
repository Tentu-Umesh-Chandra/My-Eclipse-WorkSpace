package day5;
import java.util.*;
public class LinkLisVecSta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list= new LinkedList<Integer>();
		list.add(100);
		list.add(300);
		list.add(200);
		list.add(0, -1);
		for(Integer s:list) {
			System.out.println(s);
		}
		
		//This 
		Vector<Integer> vector = new Vector<Integer>();
		vector.add(1);
		vector.add(3);
		vector.add(2);
		vector.add(0,-1);
		for(Integer s:vector) {
			System.out.println(s);
		}
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(10);
		stack.add(30);
		stack.add(20);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		
	}

}
