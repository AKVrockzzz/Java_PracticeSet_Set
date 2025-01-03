package Recursion;

import java.util.Scanner;

public class Subsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		subSequence(str, ans);
	}
	
	private static void subSequence(String ques, String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		char ch = ques.charAt(0);
		subSequence(ques.substring(1), ans);
		subSequence(ques.substring(1), ans + ch);
	}

}
