package Sorting_And_Kadanes_Algo;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,3,2,1};
		int[] result = Sort(arr);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] Sort(int[] arr) {
		int n = arr.length;
		for(int i=1; i<n; i++) {
			for(int j=0; j<n-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		return arr;
	}

}
