package Sorting_And_Kadanes_Algo;

public class Maximum_Subarray_LeetCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {-2,1-3,4,-1,2,1,-5,4};
		int[] arr2 = {5,4,-1,7,8};
		System.out.println(Max_SubArray(arr2));
	}
	
	public static int Max_SubArray(int[] arr) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			ans = Math.max(ans, sum);
			if(sum < 0) sum = 0;
		}
		
		return ans;
	}

}
