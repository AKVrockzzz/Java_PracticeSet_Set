package Recursion;

import java.util.Scanner;

public class Fibonaci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(Fibo(n));
	}
	
	private static int Fibo(int n) {
		if(n == 1 || n == 0) return n;
		
		
		int f1 = Fibo(n-1);
		int f2 = Fibo(n-2);
		
		return f1 + f2;
	}

}
