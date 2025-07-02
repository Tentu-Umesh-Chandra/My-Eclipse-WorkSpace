package practice_Qu;
import java.util.*;

class StockInfo{
	HashSet<String> sto = new HashSet<String>();
	public void addCloathStockDetails(String stockDetails) {
		sto.add(stockDetails);
	}
	public HashSet<String> filterCloathWithinStockRange(int minStock,int maxStock) {
		HashSet<String> range = new HashSet<String>();
		for(String s: sto) {
			String details[] = s.split(":");
			String cloath = details[0];
			int price = Integer.parseInt(details[1]);
			if(price>=minStock && price<=maxStock) {
				range.add(cloath);
			}
		}
//		ArrayList<String> arlst = new ArrayList<>(range);
//		Collections.sort(arlst);
		return range;
	}
}
public class StyleHub {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of cloth sizes to be added:");
		int noCloath = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter size details in the format (Cloath item with size:Quantity)");
		StockInfo obj = new StockInfo();
		String stockDetails;
		for(int i=0; i<noCloath; i++) {
			stockDetails = sc.nextLine();
			obj.addCloathStockDetails(stockDetails);
		}
		System.out.println("Enter the minimum stock quantity");
		int minStock = sc.nextInt();
		System.out.println("Enter the maximum stock quantity");
		int maxStock = sc.nextInt();
		HashSet<String> fil= new HashSet<String>();
		fil = obj.filterCloathWithinStockRange(minStock, maxStock);
		if(fil.isEmpty()) {
			System.out.println("No cloath items found within the specified quality range");
			return;
		}
		
		System.out.println("Cloath items with quantity between "+minStock+" and "+maxStock);
		for(String s: fil) {
			System.out.println(s);
		}
	}
}
