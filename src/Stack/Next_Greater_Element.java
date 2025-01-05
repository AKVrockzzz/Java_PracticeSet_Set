package Stack;
import java.util.Stack;
import java.util.*;
public class Next_Greater_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t; i++) {
			int n = sc.nextInt(); //Size of arr
			int[] arr = new int[n];
			for(int j=0; j<arr.length; j++) {
				arr[j] = sc.nextInt();
			}
			int[] result = NGE(arr);
			for(int k=0; k<result.length; k++) {
				System.out.print(result[k] + " ");
			}
		}
		
	}
	
	private static int[] NGE(int[] arr) {
		Stack<Integer>st = new Stack<>();
		int[] ans = new int[arr.length];
		
		for(int i=0; i<arr.length; i++) {
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				ans[st.pop()] = arr[i];
			}
			st.push(i);
		}
		
		while(!st.isEmpty()) {
			ans[st.pop()] = -1;
		}
		
		return ans;
	}
	
	

}
