package Searching_Algo;

public class Binary_Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,6,7,9,11,13,17,18,19,20};
		int item = 18;
		System.out.println(Search(arr,item));
	}
	
	public static int Search(int[] arr, int item) {
		int lo = 0;
		int hi = arr.length-1;
		
		while(lo <= hi) {
			int mid = (lo + hi)/2;
			
			if(arr[mid] > item) {
				hi = mid-1;
			}
			else if(arr[mid] < item) {
				lo = mid + 1;
			}
			else {
				return mid;
			}
		}
		
		return -1;
				
	}

}
