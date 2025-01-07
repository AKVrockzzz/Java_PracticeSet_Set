package Stack_1;
import java.util.Stack;
public class Largest_Rectangle_In_Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {2,3,5,4,6,1,7};
		System.out.println(Largest_Rectangle(height));
	}

	private static int Largest_Rectangle(int[] height) {
		// TODO Auto-generated method stub
		Stack<Integer> st = new Stack<>();
		int area = 0;
		for(int i=0; i<height.length; i++) {
			while(!st.isEmpty() && height[i] < height[st.peek()]) {
				int h = height[st.pop()];
				int r = i;
				
				if(st.isEmpty()) {
					area = Math.max(area, h * r);
				}
				else {
					int l = st.peek();
					area = Math.max(area, h * (r - l - 1));
				}
				
				
			}
			st.push(i);
		
		}	
		while(!st.isEmpty()) {
			int h = height[st.pop()];
			int r = height.length;
			
			if(st.isEmpty()) {
				area = Math.max(area, h * r);
			}
			else {
				int l = st.peek();
				area = Math.max(area, h * (r - l - 1));
			}
			
		}
		return area;
	}

}
