package Recursion;

public class Find_Target {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,5,3,7};
		int target = 3;
		System.out.println(Find(arr,target, 0));
	}
	
	private static int Find(int[] arr,int target, int i) {
		if(i == arr.length) return -1;
		if(arr[i] == target) return i;
		
		return Find(arr, target, i+1);
		
	}

}
