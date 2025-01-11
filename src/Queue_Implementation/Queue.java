package Queue_Implementation;

public class Queue {
	
	protected int[] arr;
	private int size = 0;
	protected int front = 0;
	
	public Queue(int n) {
		arr = new int[n];
	}
	
	public Queue() {
		this(5);
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == arr.length;
	}
	
	public int size() {
		return size;
	}
	
	public void Enqueue(int item)throws Exception {
		if(isFull()) {
			throw new Exception("Queue size is full");
		}
		int idx = (front+size) % arr.length;
		arr[idx] = item;
		size++;
	}
	
	public int Dequeue() throws Exception{
		if(isEmpty()) {
			throw new Exception("Queue is empty");
		}
		int v = arr[front];
		front = (front + size) % arr.length;
		front++;
		size++;
		return v;
	}
	
	public int getFront() {
		int v = arr[front];
		return v;
	}
	
	public void Display() {
		for(int i=0; i<size; i++) {
			int idx = (front + i) % arr.length;
			System.out.print(arr[idx] + " ");
		}
		System.out.println();
	}
}
