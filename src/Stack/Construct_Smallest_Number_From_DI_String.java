package Stack;
import java.util.Stack;
public class Construct_Smallest_Number_From_DI_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "IIIDIDDD";
		System.out.println(smallest_Number(str));
	}
	
	public static String smallest_Number(String pattern) {
		int[] ans = new int[pattern.length()+1];
		int count = 1;
		Stack<Integer> st = new Stack<>();
		for(int i = 0; i<=pattern.length(); i++) {
			if(i == pattern.length() || pattern.charAt(i) == 'I') {
				ans[i] = count++;
				while(!st.isEmpty()) {
					ans[st.pop()] = count++;
				}
			}
			else {
				st.push(i);
			}
		}
		String s = "";
		for(int i=0; i<ans.length; i++) {
			s += ans[i];
		}
		
		return s;
	}

}


// 1  432 5 7 6 9 8 