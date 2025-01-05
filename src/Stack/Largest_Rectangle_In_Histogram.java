package Stack;
import java.util.Stack;
public class Largest_Rectangle_In_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,1,5,6,2,3};
		System.out.println(largestArea(height));
	}
	
	private static int largestArea(int[] height) {
		int area = 0;
		Stack<Integer> st = new Stack<>();
		
		for(int i=0; i<height.length; i++) {
			while(!st.isEmpty() && height[i] < height[st.peek()]) {
				int h = height[st.pop()];
				int r = i;
				if(st.isEmpty()) {
					area = Math.max(area, h * r);
				}
				else {
					int l = st.peek();
					area = Math.max(area, h * (r-l-1));
				}
			}
			st.push(i);
		}
		
		int r = height.length;
		while(!st.isEmpty()) {
			int h = height[st.pop()];
			if(st.isEmpty()) {
				area = Math.max(area, h * r);
			}
			else {
				int l = st.peek();
				area = Math.max(area, h * (r-l-1));
			}
		}
		
		return area;
	}
}
