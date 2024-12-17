package LeetCode;

public class Remove_Element {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,2,3};
		int val = 3;
		System.out.println(Remove(arr,val));
	}

	private static int Remove(int[] nums, int val) {
		// TODO Auto-generated method stub
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[i] != val) {
				count++;
			}
		}
		return count;
	}

}
