package Stack;

public class Stack {
	private int[] arr;
	private int idx = -1;
	
	public Stack(int n) {
		arr = new int[n];
	}
	
	public Stack() {
		this(5);
	}
	
	public boolean isEmpty() {
		return idx==-1;
	}
	
	public boolean isFull() {
		return size() == arr.length;
	}
	
	public int size() {
		return idx + 1;
	}
	public void push(int item) throws Exception{
		if(isFull()) {
			throw new Exception("bklol stak full ho gya hai ");
		}
		idx++;
		arr[idx] = item;
	}
	
	public int peek() throws Exception{
		if(isEmpty()) {
			throw new Exception("bklol stak khali hai ");
		}
		return arr[idx];
	}
	
	public int pop() {
		int rv = arr[idx];
		idx--;
		return rv;
	}
	
	public void Display() {
		for(int i = 0; i<=idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
