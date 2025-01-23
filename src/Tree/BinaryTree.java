package Tree;

import java.util.Scanner;

public class BinaryTree {
	
	class Node {
		int val;
		Node left;
		Node right;
	}
	
	private Node root;
	Scanner sc = new Scanner(System.in);
	
	public BinaryTree() {
		root = CreateTree();
	}
	
	public Node CreateTree() {
		int item = sc.nextInt();
		Node nn = new Node();
		nn.val = item;
		boolean hlc = sc.nextBoolean();
		if(hlc) {
			nn.left = CreateTree();
		}
		
		boolean hrc = sc.nextBoolean();
		if(hrc) {
			nn.right = CreateTree();
		}
		
		return nn;
	}
	
	public void Display() {
		Display(root);
	}
	
	private void Display(Node nn) {
		if( nn == null) return;
		String s = "<--" + nn.val + "-->";
		
		if(nn.left != null) {
			s = nn.left.val + s;
		}
		else {
			s = "." + s;
		}
		
		if(nn.right != null) {
			s = s + nn.right.val;
		}
		else {
			s = s + ".";
		}
		System.out.println(s);
		Display(nn.left);
		Display(nn.right);
	}
	
	public int max() {
		return max(root);
	}
	
	private int max(Node nn) {
		if(nn == null) return Integer.MIN_VALUE;
		
		int lmax = max(nn.left);
		int rmax = max(nn.right);
		return Math.max(nn.val, Math.max(lmax, rmax));
	}
	
	public boolean Find(int item) {
		return Find(this.root, item);
	}
	
	private boolean Find(Node nn, int item) {
		if(nn == null) {
			return false;
		}
		
		if(nn.val == item) {
			return true;
		}
		
		boolean left = Find(nn.left, item);
		boolean right = Find(nn.right, item);
		
		return left || right;
	}
	
	public int ht() {
		return ht(root);
	}
	
	
	private int ht(Node nn) {
		if(nn == null) return -1;
		int lh = ht(nn.left);
		int rh = ht(nn.right);
		
		return Math.max(lh, rh) + 1;
	}
	
	public void PreOrder() {
		PreOrder(root);
		System.out.println();
	}
	
	
	private  void PreOrder(Node nn) {
		if(nn == null) return;
		System.out.print(nn.val + " ");
		PreOrder(nn.left);
		PreOrder(nn.right);
	}
	
	public void InOrder() {
		InOrder(root);
		System.out.println();
	}
	
	public void PostOrder() {
		PostOrder(root);
		System.out.println();
	}
	
	private void PostOrder(Node nn) {
		if(nn == null) return;
		
		PostOrder(nn.left);
		PostOrder(nn.right);
		System.out.print(nn.val + " ");
	}
	
	
	private void InOrder(Node nn) {
		if(nn == null) return;
		InOrder(nn.left);
		System.out.print(nn.val + " ");
		InOrder(nn.right);
	}
}
