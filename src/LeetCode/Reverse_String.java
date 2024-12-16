package LeetCode;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //Size of an array
		String s = sc.next();
		
		
		char[] reverse = Reverse(s.toCharArray());
		System.out.println(reverse);
		
	}
	
	public static char[] Reverse(char[] s) {
		int i = 0;
		int j = s.length - 1;
		
		while(i < j) {
			char temp = s[i];
			s[i] = s[j];
			s[j] = temp;
			i++;
			j--;
		}
		return s;
	}

}
