package day2;

public class Program1_Method {
	
	static void sum(int num1,int num2) {
		System.out.println(num1+num2);
	}
	static void sum(int num1,int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	static void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sum(10,20);
		sum(11,22);
		sum(10,10.5f);
		sum(15,13.34f);
		sum(239,2134,44);
	}

}
