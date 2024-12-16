package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Two_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //Size of array
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		int target = sc.nextInt(); //Traget for finding sum
		int[] result = TwoSum(arr,target);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] TwoSum(int[] nums, int target) {
	    // Iterate through each pair of indices
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            // Check if the pair sums up to the target
	            if (nums[i] + nums[j] == target) {
	                // Return the indices as a result
	                return new int[]{i, j};
	            }
	        }
	    }
	    // If no solution is found, return an empty array
	    return new int[]{};
	}
	
//	public static int[] TwoSum(int[] nums, int target) {
//		Arrays.sort(nums);
//		int i = 0;
//		int j = nums.length-1;
//		
//		while(i < j) {
//			int sum = nums[i] + nums[j];
//			if(sum > target) j--;
//			else if(sum < target) i++;
//			else {
//			return new int[] {i,j};
//			}
//		}
//		
//		return new int[] {};
//		
//	}
	
//	public static void TwoSum(int[] nums, int target) {
//        int i = 0; // Start index
//        int j = nums.length - 1; // End index
//
//        while (i < j) {
//            int sum = nums[i] + nums[j];
//            if (sum > target) {
//                j--; // Decrement the right pointer
//            } else if (sum < target) {
//                i++; // Increment the left pointer
//            } else {
//                System.out.println(i + "," + j); // Print the indices
//                return; // Exit the function after finding one pair
//            }
//        }
//
//        System.out.println("No valid pair found."); // Print if no pair is found
//    }

}
