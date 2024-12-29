package Stack;
import java.util.Stack;
public class Baseball_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"5","-2","4","C","D","9","+","+"};
		System.out.println(Points(arr));
	}
	
	public static int Points(String[] a) {
		Stack<Integer> st = new Stack<>();
		for(int i=0; i<a.length; i++) {
			if(a[i].equals("C")) {
				st.pop();
			}
			else if(a[i].equals("D")) {
				int x = st.peek();
				st.push(2*x);
			}
			else if(a[i].equals("+")) {
				int x = st.pop();
				int y = st.pop();
				st.push(y);
				st.push(x);
				st.push(x+y);
			}
			else {
				st.push(Integer.parseInt(a[i]));
			}
		}
		int sum = 0;
		for(int val : st) {
			sum += val;
		}
		return sum;
	}

}
