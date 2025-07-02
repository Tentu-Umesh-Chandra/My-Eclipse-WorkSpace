package day5;
import java.util.*;
import java.util.HashMap;
import java.util.Map.Entry;

public class program3_Hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap<Integer,String> map = new HashMap<Integer,String>();
		//LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
		TreeMap<Integer,String> map = new TreeMap<Integer,String>();
		map.put(100, "A");
		map.put(10, "B");
		map.put(20, "C");
		System.out.println(map);
		System.out.println(map.get(10));
		System.out.println(map.remove(10));
		for(Entry<Integer,String>e:map.entrySet()) {
			System.out.println(e.getKey()+" "+e.getValue());
		}
		
		String str = "The day today is very very very long day";
		String arr[] = str.split(" ");
		HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		for(int i=0; i<arr.length; i++) {
			map1.put(i,arr[i]);
		}
		
		//map1.put(1,str);
	}

}
