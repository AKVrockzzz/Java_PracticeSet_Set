package Sorting_And_Kadanes_Algo;

public class Insertion_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {4,5,-1,3,9,-11,2,7};
		Sort(arr);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static int[] Sort(int[] arr) {
		for(int i=1; i<arr.length; i++) {
			InsertLastElement(arr,i);
		}
		return arr;
	}

	private static void InsertLastElement(int[] arr, int i) {
		// TODO Auto-generated method stub
		int item = arr[i];
		int j = i-1;
		while(j>=0 && arr[j] > item) {
			arr[j+1] = arr[j];
			j--;
		}
		arr[j+1] = item;
	}

}
