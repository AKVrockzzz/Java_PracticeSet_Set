package Stack_1;
import java.util.Stack;
public class Insert_last {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		int item = -6;
		System.out.println(st);
		Insert(st, item);
		
		System.out.println(st);

	}
	
	private static void Insert(Stack<Integer> st,int item) {
		if(st.isEmpty()) {
			st.push(item);
			return;
		}
		
		
		int x = st.pop();
		Insert(st , item);
		st.push(x);
	}

}
