package Recursion;

public class Dice_Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int curr = 0;
		int end = 4;
		String ans = "";
		Roll(curr, end, ans);
	}

	private static void Roll(int curr, int end, String ans) {
		// TODO Auto-generated method stub
		if(curr > end) return;
		
		if(curr == end) {
			System.out.println(ans);
			return;
		}
		
		
		Roll(curr + 1, end, ans + 1);
		Roll(curr + 2, end, ans + 2);
		Roll(curr + 3, end, ans + 3);
	}

}
