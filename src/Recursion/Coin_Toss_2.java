package Recursion;

import java.util.Scanner;

public class Coin_Toss_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String ans = "";
		Toss(n, ans);
	}
	
	private static void Toss(int n, String ans) {
		// TODO Auto-generated method stub
		if(n == 0) {
			System.out.println(ans);
			return;
		}
		
		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'H') {
			Toss(n-1, ans + "H");

		}
		
		Toss(n-1, ans + "T");
		
//		if(ans.length() == 0 || ans.charAt(ans.length() - 1) != 'T') {
//			Toss(n-1, ans + "T");
//
//		}
	}

}
