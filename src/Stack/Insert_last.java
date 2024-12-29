package Stack;
import java.util.Stack;
public class Insert_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		InsertLast(st, 7);
		System.out.println(st);
	}
	
	private static void InsertLast(Stack<Integer> st, int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		int x = st.pop();
		
		InsertLast(st, item);
		st.push(x);
	}

}
