package practice_Qu;
import java.util.*;
/*
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
balanceWord
 */
public class AssignCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String assign = sc.next();
		String ss1;
		String ss2;
		if(!assign.matches("[a-zA-Z]+")||assign.length()<2) {
			return;
		}
		if(assign.length()%2==0) {
			ss1 = assign.substring(0,assign.length()/2);
			ss2 = assign.substring(assign.length()/2,assign.length());
		}
		else {
			ss1 = assign.substring(0,assign.length()/2);
			ss2 = assign.substring(assign.length()/2+1,assign.length());
		}
		System.out.println(ss1+" "+ss2);
		int count1 = 0;
		int count2 = 0;
		for(int i=0; i<ss1.length(); i++) {
			count1+=ss1.charAt(i)-'a'+1;
		}
		System.out.println(count1);
		for(int i=0; i<ss2.length(); i++) {
			count2+=ss2.charAt(i)-'a'+1;
		}
		System.out.println(count2);
		if(count1 == count2) {
			System.out.println("Same");
		}
		else {
			System.out.println("Diff");
		}
	}

}
