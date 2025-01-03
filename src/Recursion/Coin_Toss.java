package Recursion;

import java.util.Scanner;

public class Coin_Toss {

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
		
		Toss(n-1, ans + "H");
		Toss(n-1, ans + "T");
	}

}
