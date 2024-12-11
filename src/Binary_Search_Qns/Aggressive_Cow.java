package Binary_Search_Qns;
import java.util.*;
public class Aggressive_Cow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Number of stall
		int[] stall = new int[n];
		for(int i=0; i<n; i++) {
			stall[i] = sc.nextInt();
		}
		int c = sc.nextInt(); //Number of cow
		Arrays.sort(stall);
		System.out.println(largest_Min_Dist(stall, c));
	}
	
	public static int largest_Min_Dist(int[] stall, int c) {
		int lo = 0;
		int hi = stall[stall.length-1] - stall[0];
		int ans = 0;
		while(lo<=hi) {
			int mid = (lo+hi)/2;
			if(isPossible(stall, c, mid)) {
				ans = mid;
				lo = mid+1;
			}
			else {
				hi = mid-1;
			}
		}
		return ans;
	}

	public static boolean isPossible(int[] stall, int c, int mid) {
		// TODO Auto-generated method stub
		int cow = 1;
		int pos = stall[0];
		for(int i=1; i<stall.length; i++) {
			if(stall[i] - pos >= mid) {
				cow++;
				pos = stall[i];
			}
			if(cow == c) {
				return true;
			}
		}
		return false;
	}

}
