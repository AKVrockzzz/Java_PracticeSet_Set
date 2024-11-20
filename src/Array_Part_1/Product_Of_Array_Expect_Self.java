package Array_Part_1;
import java.util.*;
public class Product_Of_Array_Expect_Self {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr =  new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] result = Product(arr);
		for(int i=0; i<result.length; i++) {
			System.out.print(result[i] + " ");
		}
	}
	
	public static int[] Product(int[] arr) {
		int n = arr.length;
		int[] left = new int[n];
		left[0] = 1;
		for(int i=1; i<left.length; i++) {
			left[i] = left[i-1] * arr[i-1];
		}
		
		int[] right = new int[n];
		right[n-1] = 1;
		for(int i=n-2; i>=0; i--) {
			right[i] = right[i+1] * arr[i+1];
		}
		
		for(int i=0; i<n; i++) {
			left[i] = left[i] * right[i];
		}
		
		return left;
	}

}
