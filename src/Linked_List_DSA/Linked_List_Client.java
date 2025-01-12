package Linked_List_DSA;

public class Linked_List_Client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List ll = new Linked_List();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddFirst(40);
		ll.Display();
		ll.AddLast(50);
		ll.Display();
		
		ll.AddatIndex(2, -9);
		ll.Display();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.getatIndex(2));
	}

}
