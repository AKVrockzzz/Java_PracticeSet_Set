package Array_Part_1;

public class Rotate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7};
		int k = 3;
		RotateArray(arr,k);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void RotateArray(int[] arr, int k) {
		int n = arr.length;
		Range_Reverse(arr, 0, n-k-1);
		Range_Reverse(arr, n-k, n-1);
		Range_Reverse(arr, 0, n-1);
	} 
	
	public static void Range_Reverse(int[] arr, int i, int j) {
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
	
	

}
