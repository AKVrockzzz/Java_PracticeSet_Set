package Stack_1;
import java.util.Stack;
public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str = {"5","-2","4","C","D","9","+","+"};
		System.out.println(Score(str));
	}
	
	private static int Score(String[] str) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<str.length; i++) {
			if(str[i].equals("C")) st.pop();
			else if(str[i].equals("D")) {
				int x = st.peek();
				st.push(x * 2);
			}
			else if(str[i].equals("+")) {
				int a = st.pop();
				int b = st.peek();
				st.push(a);
				st.push(a + b);
			}
			else {
				st.push(Integer.parseInt(str[i]));
			}
		}
		
		int sum = 0;
		for(int num : st) {
			sum += num;
		}
		return sum;
	}

}
