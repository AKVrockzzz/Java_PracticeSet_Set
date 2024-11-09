package Array_Part_1;

public class Range_Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,1,7,8,6,9,11,15,17,18,16,23,27};
		Range_Reverse(arr, 3, 10);
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
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
