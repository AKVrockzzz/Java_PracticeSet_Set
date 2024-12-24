package LeetCode;

public class Arranging_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 11;
		System.out.println(ArrangeCoin(n));	}
	
	public static int ArrangeCoin(int n) {
		int lo = 0;
		int hi = n;
		while(lo <= hi) {
			int mid = lo+(hi-lo) / 2;
			
			if((mid * (mid + 1)/ 2) <= n) {
				lo = mid+1;
			}
			else hi = mid - 1;
		}
		
		return lo - 1;
	}

}
