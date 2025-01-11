package Queue_Implementation;

public class Dynamic_Queue extends Queue {

	@Override
	public void Enqueue(int item) throws Exception {
		if(isFull()) {
			int[] new_arr = new int[2 * arr.length];
			for(int i=0; i<arr.length; i++) {
				int idx = (front + 1) % arr.length;
				new_arr[i] = arr[idx];
			}
			
			front = 0;
			arr = new_arr;
		}
		super.Enqueue(item);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Dynamic_Queue dq = new Dynamic_Queue();
		dq.Enqueue(10);
		dq.Enqueue(20);
		dq.Enqueue(30);
		dq.Enqueue(40);
		dq.Enqueue(50);
		
		System.out.println( );
		System.out.println(dq.Dequeue());
		dq.Enqueue(60);
		dq.Enqueue(70);
		dq.Enqueue(80);
		dq.Display();
	}

}
