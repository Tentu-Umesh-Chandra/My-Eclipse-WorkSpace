package practice_Qu;
import java.util.*;
public class Min_Screens {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of Entries");
		int entries = sc.nextInt();
		System.out.println("Enter the start time and end time seperated by gaps");
		if(entries>0){
		    int arr[][] = new int[entries][2];
		    for (int i = 0; i < entries; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
                if (arr[i][0] > arr[i][1]) {
                    System.out.println("Invalid start-end times were mentioned");
                    return;
                }
            }
		    int screen = 1;
		    for(int i=1; i<entries-1; i++){
		        if(arr[i][0]<arr[0][1]){
		            screen++;
		        }
		    }
		    System.out.println("Minimum Number of screens required = "+screen);
		}
		else{
		    System.out.println("Invalid no of Entries");
		    return;
		}
		
		
	
//		 Scanner sc = new Scanner(System.in);
//         System.out.println("Enter no of Entries");
//         int entries = sc.nextInt();
//         System.out.println("Enter the start time and end time separated by gaps");
//         if (entries > 0) {
//             int[][] arr = new int[entries][2];
//             for (int i = 0; i < entries; i++) {
//                 arr[i][0] = sc.nextInt();
//                 arr[i][1] = sc.nextInt();
//                 if (arr[i][0] > arr[i][1]) {
//                     System.out.println("Invalid start-end times were mentioned");
//                     return;
//                 }
//             }
//             // Sort intervals by start time
//             Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
//             // Min-heap to track end times
//             PriorityQueue<Integer> pq = new PriorityQueue<>();
//             for (int[] interval : arr) {
//                 if (!pq.isEmpty() && pq.peek() <= interval[0]) {
//                     pq.poll(); // Reuse screen
//                 }
//                 pq.offer(interval[1]); // Allocate screen
//             }
//             System.out.println("Minimum Number of screens required = " + pq.size());
//         } 
//         else {
//             System.out.println("Invalid no of Entries");
//         }
		 
	}

}
/*
 import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("Invalid n")
        }
        int[] starttime=new int[n];
        int[] endtime = new int[n];
        
        for(int i=0;i<n;i++){
            int start=sc.nextInt();
            int end = sc.nextInt();
            if(start>end){
                System.out.println("start>end");
                return;
            }
            starttime[i]=start;
            endtime[i]=end;
        }
        Arrays.sort(starttime);
        Arrays.sort(endtime);
        
        int i=0;
        int j=0;
        int minScr=0;
        while(i<n && j<n){
            if(starttime[i]<endtime[j]){
                minScr++;
                i++;
            }else{
                minScr--;
                j++;
            }
        }
        System.out.println(minScr);
        
    }
}
 */
