package Stack_1;

public class Stack {
	
	private int[] arr;
	private int idx = -1;
	
	public Stack() {
		arr = new int[5];
	}
	
	public Stack(int n) {
		arr = new int[n];
	}
	
	public boolean isEmpty() {
		return idx == -1;
	}
	
	public boolean isfull() {
		return idx == arr.length - 1;	}
	
	public int size() {
		return idx+1;
	}
	
	public void push(int item)  throws Exception{
		if(isfull()) {
			throw new Exception("Bklol stack full hai");
		}
		idx++;
		arr[idx] = item;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Bklol stack khali hai");
		}
		return arr[idx--];
	}
	
	public int peek()throws Exception {
		if(isEmpty()) {
			throw new Exception("Bklol stack khali hai");
		}
		return arr[idx];
	}
	
	public void Display() {
		for(int i=0; i<= idx; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
}
