package Sorting_And_Kadanes_Algo;

public class Selection_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {5,3,-7,4,8,2};
		int[] result = Sort(arr);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] Sort(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			int min = Minimum(arr,i);
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		
		return arr;
	}
	
	public static int Minimum(int[] arr, int i) {
		int mini = i;
		for(int j=i+1; j<arr.length; j++) {
			if(arr[j] < arr[mini]) mini = j;
		}
		
		return mini;
	}

}
