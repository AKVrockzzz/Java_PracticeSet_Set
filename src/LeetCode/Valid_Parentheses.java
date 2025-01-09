package LeetCode;
import java.util.Stack;
public class Valid_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "(";
		System.out.println(Check(s));
	}
	
	private static boolean Check(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{') {
				st.push(ch);
			}
			else {
				if(st.isEmpty()) return false;
				if(ch == ')' && st.pop() != '(' || 
				   ch == '}' && st.pop() != '{' ||
				   ch == ']' && st.pop() != '[') {
					return false;
				}
			}
		}
		
		return st.isEmpty();
	}

}
