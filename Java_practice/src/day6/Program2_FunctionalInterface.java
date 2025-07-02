package day6;
import java.util.*;
//import java.sql.*;
@FunctionalInterface
interface ITest{
	String greet(String name);
}
public class Program2_FunctionalInterface {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Lamida Expression ->from 12 to 14
		
		ITest obj = (str)->{
			return "Hello "+str;
		};
		String result = obj.greet("Rahul");
		System.out.println(result);
	}
}
//4 Types of Functional Interfaces
//Predicate  (data)--->boolean       //Takes parameter and returns bool //Eg.  equals()
//Function   (data)--->value
//Consumer   (data)--->no            //Eg.  forEach
//Supplier   (no)--->data            //Eg.  length(),toUpperCase()