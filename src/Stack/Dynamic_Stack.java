package Stack;

public class Dynamic_Stack extends Stack{

	
	@Override
	public void push(int item) throws Exception {
		if(isFull()) {
			int[] new_arr = new int[2 * arr.length];
			for(int i=0; i<arr.length; i++) {
				new_arr[i] = arr[i];
			}
			arr = new_arr;
		}
		
		super.push(item);
	}
	
	
	public static void main(String[] args) throws Exception {
		Dynamic_Stack ds = new Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.Display();
		ds.push(60);
		
		ds.Display();
	}
}
