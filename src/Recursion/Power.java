package Recursion;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3, b = 5;
		System.out.println(Pow(a,b));
	}
	
	private static int Pow(int a, int b) {
		if(b == 0) return 1;
		
		int ans = Pow(a,b-1);
		return ans * a;
	}

}
