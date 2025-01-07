package LeetCode;
import java.util.Stack;
public class Daily_Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {73,74,75,71,69,72,76,73};
		Temperature(arr);
	}
	
	private static void Temperature(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i] > arr[st.peek()]) {
				ans[st.peek()] = i - st.peek();
				st.pop();
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			arr[st.pop()] = 0;
		}
		
		for(int i=0; i<ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

}
