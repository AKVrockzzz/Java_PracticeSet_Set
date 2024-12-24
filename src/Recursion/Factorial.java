package Recursion;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println(fact(n));
	}
	
	private static int fact(int n) {
		if(n == 1 || n == 0) return 1;
		
		int f = fact(n-1) * n;
		
		return f;
	}

}
