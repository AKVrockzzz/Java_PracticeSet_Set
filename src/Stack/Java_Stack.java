package Stack;
import java.util.Stack;
public class Java_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		//add
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		//get
		System.out.println(st.peek());
		
		//remove
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		
		//print stack
		for(int i : st) {
			System.out.print(i + " ");
		}
	}

}
