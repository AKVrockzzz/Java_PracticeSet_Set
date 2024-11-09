package Array_Part_1;

public class Max_Value {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,1,7,8};
		System.out.println(Max(arr));
	}
	
	public static int Max(int[] arr) {
		int ans = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			ans = Math.max(ans, arr[i]);
		}
		
		return ans;
	}

}
