package practice_Qu;
import java.util.*;
public class StringPrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello World";
		System.out.println(str.charAt(1));
		System.out.println(str.concat(" Program"));
		System.out.println(str.indexOf('e'));
		System.out.println(str.length());
		System.out.println(str.replace(' ', '_'));
		System.out.println(str.substring(2,5));
		String str2 = "        Hello           World";
		System.out.println(str2.stripTrailing());
		System.out.println(str2.stripLeading());
		
		StringBuilder rev = new StringBuilder(str);
		System.out.println(rev);
		
		String str3 = "hello";
		String str4 = "hello";
		
		String str5 = new String("hello");
		String str6 = new String("hello");
		
		if(str3 == str4) {
			System.out.println("one");
		}
		if(str3.equals(str4)) {
			System.out.println("two");
		}
		if(str5 == str6) {
			System.out.println("three");
		}
		if(str5.equals(str6)) {
			System.out.println("four");
		}
		
		char gender = 'F';
		(gender+"").equalsIgnoreCase("f");
		float floatdata = 9.6f;
		String result = floatdata+"";
		
		
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("three");
		//list.clear();
//		System.out.println(list);
//		List<String>list2 = list.reversed();
//		System.out.println(list2);
		Collections.sort(list,Comparator.reverseOrder());
		System.out.println(list);
	}
}
/*
1)Array aggregate

2)split a string

3)assign character
AMPC
A
M
P
C
A+M=C+P
StringBuilder sb1 = "AM"
StringBuilder sb2 = "CP"
char alpha = str.charAt(0);
int alphaNum = char;//65
do -64

4)list remove based on string input
list.remove(0);

reverse the list



1)
12
27
39
42
39
Arrays.sort()

2) if there is abcd we need to split into 2 equal halves


*/
/*
pick a Screen
input should'nt be lest than 0
start<end time

3
12
34
56
screen=1
.........
3
23
26
58
screen=2
..........
[10 12] [11 14] [13 15] [16 18]
 */
