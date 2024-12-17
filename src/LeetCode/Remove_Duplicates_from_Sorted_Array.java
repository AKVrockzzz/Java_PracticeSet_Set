package LeetCode;

import java.util.Scanner;

public class Remove_Duplicates_from_Sorted_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //size of array
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Remove_Dub(arr));
		
	}
	
	public static int Remove_Dub(int[] nums) {
		int j = 0;
		for(int i=0; i<nums.length; i++) {
			if(nums[j] != nums[i]) {
				j++;
				nums[j] = nums[i];
			}
		}
		
		return j+1;
	}

}
