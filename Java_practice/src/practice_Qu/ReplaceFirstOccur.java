package practice_Qu;
import java.util.*;
/*
1. in String find the character in that string and find all the occurance of char and replace
if char is not present in the string +"" 
replace the only first occurance. 
*/
public class ReplaceFirstOccur {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String sen");
		String sen = sc.nextLine();
		if(!sen.matches("[a-zA-Z]+")||sen.length()<2) {
			System.out.println("Invalid Sentance");
			return;
		}
		char unit = 'u';
		String strcha = unit+"";
		sen = sen.replaceFirst(strcha, "a");
		System.out.println(sen);
	}
}
