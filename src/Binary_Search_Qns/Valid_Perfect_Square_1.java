package Binary_Search_Qns;
import java.util.*;
public class Valid_Perfect_Square_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Find the perfect square of this number
		System.out.println(perfectSqu(n));
	}
	
	public static boolean perfectSqu(int n) {
		int lo = 0;
		int hi = n;
		
		while(lo <= hi) {
			int mid = lo + ((hi-lo)/2);
			int sq = mid * mid;
			if(sq > n) {
				hi = mid - 1;
			}
			else if(sq < n) {
				lo = mid + 1;
			}
			else {
				return true;
			}
		}
		return false;
	}

}
