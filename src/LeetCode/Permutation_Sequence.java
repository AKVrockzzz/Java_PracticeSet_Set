package LeetCode;

public class Permutation_Sequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		int k = 3;
		String ques = "";
		for(int i=1; i<=n ; i++) {
			ques += i;
		}
		String ans = "";
		Sequence(ques, k, 0, ans);
	}

	private static void Sequence(String ques, int k, int count, String ans) {
		// TODO Auto-generated method stub
		if(ques.length() == 0) {
			count++;
			return;
		}
		
		if(count == k) {
			System.out.println(ans);
		}
		
		for(int i=0; i<ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			Sequence(s1 + s2, k, count, ans + ch);
		}
	}

}
