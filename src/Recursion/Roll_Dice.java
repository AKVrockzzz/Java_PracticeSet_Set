package Recursion;

public class Roll_Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		int dice = 0;
		String ans = "";
		Roll(n, dice, ans);
	}
	
	private static void Roll(int n, int dice, String ans) {
		if(dice > n) return;
		if(dice == n) {
			System.out.println(ans);
			return;
		}
		Roll(n, dice + 1, ans + 1);
		Roll(n, dice + 2, ans + 2);
		Roll(n, dice + 3, ans + 3);
		
	}

}
