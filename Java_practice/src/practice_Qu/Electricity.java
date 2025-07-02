package practice_Qu;
import java.util.*;
public class Electricity {
	private HashSet<String> hs;
	public void setHahSet(HashSet<String> hs) {
		this.hs=hs;
	}
	public void addUsageData(String details) {
		hs.add(details);
	}
	public List<String> findExessiveUsageMeters(){
		List<String> exe = new ArrayList<>();
		for(String s: hs) {
			String details[] = s.split(":");
			if(Integer.parseInt(details[1])>=500) {
				exe.add(details[0]);
			}
		}
		return exe;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of details");
		int noDetails = sc.nextInt();
		Electricity obj = new Electricity();
		HashSet<String> hs = new HashSet<>();
		obj.setHahSet(hs);
		sc.nextLine();
		System.out.println("Enter the details");
		for(int i=0; i<noDetails; i++) {
			String det = sc.nextLine();
			obj.addUsageData(det);
		}
		
		List<String> exe = obj.findExessiveUsageMeters();
		if(exe.isEmpty()) {
			System.out.println("No elements found");
			return;
		}
		System.out.println("Meter ids for the given condition are:");
		for(String s: exe) {
			System.out.println(s);
		}
	}
}