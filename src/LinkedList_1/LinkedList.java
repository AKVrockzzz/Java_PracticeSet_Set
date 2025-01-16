package LinkedList_1;

public class LinkedList {
	class Node {
		int val;
		Node next;
	}
	
	private Node head;
	private Node tail;
	private int size;
	
	public void AddFirst(int item) {
		Node nn = new Node();
		nn.val = item;
		
		if(size == 0) {
			head = nn;
			tail = nn;
		}
		else {
			nn.next = head;
			head = nn;
		}
		size++;
	}
	
	public void AddLast(int item) {
		if(size == 0) {
			AddFirst(item);
		}
		else {
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}
	
	public void AddAtIndex(int item, int k) throws Exception{
		if(k == 0) AddFirst(item);
		else if(k == size) AddLast(item);
		else {
			Node nn = new Node();
			nn.val = item;
			Node prev = GetNode(k - 1);
			nn.next = prev.next;
			prev.next = nn;
			size++;
		}
	}
	
	
	public Node GetNode(int k) throws Exception{
		if(k < 0 || k >= size) throw new Exception("Bklol k tho shi daal de Budwak khen ka :-(");
		
		Node temp = head;
		for(int i=0; i<k; i++) {
			temp = temp.next;
			
		}
		return temp;
	}
	
	public int GetFirstValue() {
		return head.val;
	}
	
	public int GetLastValue() {
		return tail.val;
	}
	
	public Node GetHead() {
		return head;
	}
	
	public Node GetTail() {
		return tail;
	}
	
	
	public int RemoveFirst() {
		int val = head.val;
		if(size == 1) {
			head = null;
			tail = null;
		}
		else {
			Node temp = head;
			head = head.next;
			temp.next = null;
		}
		size--;
		return val;
	}
	
	public int RemoveLast() throws Exception{
		if(size == 1) return RemoveFirst();
		else {
			int val = tail.val;
			Node prev = GetNode(size - 2); 
			tail = prev;
			tail.next = null;
			size--;
			return val;
		}
		
	}
	
	public int Size() {
		return size;
	}
	
	
	public void Display() {
		Node temp = head;
		
		while(temp != null) {
			System.out.print(temp.val + "-->");
			temp  = temp.next;
		}
		System.out.println();
	}
}
