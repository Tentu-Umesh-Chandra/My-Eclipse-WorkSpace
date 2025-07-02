package day2;
import java.util.Scanner;
public class Reversing2nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a,b; //8,2
		a = sc.nextInt();
		b = sc.nextInt();
		b = a-b; //b=8-2=6
		a = a-b; //a=8-6=2
		b = a+b; //b=2+6=8
		System.out.println(a+" "+b);
	}

}
