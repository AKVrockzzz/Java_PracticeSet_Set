package LeetCode;

import java.util.Stack;

public class Maximal_Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = {{'1','0','1','0','0'},
				   		   {'1','0','1','1','1'},
				   		   {'1','1','1','1','1'},
				   		   {'1','0','0','1','0'}};
		
		int[] arr = new int[matrix[0].length];
		int ans = 0;
		for(int i=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[0].length; j++) {
				if(matrix[i][j] == '1') arr[j]++;
				else arr[j] = 0;
			}
			ans = Math.max(ans, largestArea(arr));
		}
		System.out.println(ans);
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
