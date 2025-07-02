package practice_Qu;
import java.util.*;
public class ListReverseBasedOnInput {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<String> lir= new ArrayList<>();
		System.out.println("Start entering the words");
		String word = sc.nextLine();
		while(!word.equalsIgnoreCase("bye")) {
			lir.add(word);
			word = sc.nextLine();
		}
		List<String> lir2= new ArrayList<>();
		if(lir.isEmpty()) {
			System.out.println("Enter atleast one word as the list id empty");
		}
//		else {
//			Collections.reverse(lir);
//		}
		
		else {
			for(int i=0; i<lir.size(); i++) {
				StringBuilder revs = new StringBuilder(lir.get(i));
				//lir.set(i,revs.reverse().toString());
				lir2.add(revs.reverse().toString());
			}
			//Collections.reverse(lir);
		}
		for(String s:lir2) {
			System.out.println(s+" ");
		}
	}
}
