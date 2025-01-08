package LeetCode;
import java.util.*;
public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new ArrayList<>();
		int n = 3;
		int opn = 0;
		int cls = 0;
		String ans = "";
		Generate(n,opn, cls, ans, ll);
		System.out.println(ll);
	}

	private static void Generate(int n, int opn, int cls, String ans, List<String> ll) {
		// TODO Auto-generated method stub
		if(opn > n || cls > opn) return;
		if(opn == n && cls == n) {
//			System.out.println(ans);
			ll.add(ans);
			return;
		}
		
		Generate(n,opn +1, cls, ans + "(", ll);
		Generate(n,opn , cls + 1, ans + ")", ll);
		
	}

}
