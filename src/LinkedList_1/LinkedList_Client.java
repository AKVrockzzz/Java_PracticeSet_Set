package LinkedList_1;

public class LinkedList_Client {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll.Display();
		
		ll.AddLast(50);
		ll.Display();
		
		System.out.println(ll.GetNode(3).val);
		System.out.println(ll.GetFirstValue());
		System.out.println(ll.GetLastValue());
		System.out.println(ll.GetHead().val);
		System.out.println(ll.GetTail().val);
	}

}
