package Oopss_Concept;

public class Addition {
	public static void main(String[] args) {
		System.out.println(12 + 8);
		System.out.println(12 + 8 + 10);
		System.out.println(12 + 8.8);
		System.out.println(12 + 8l);
		System.out.println(add(2,3,4,3,53,4,2,1,3));
	}
	
	
	
	
	public static int add(int ...x) {
		int sum = 0;
		for(int i=0; i<x.length; i++) {
			sum += x[i];
		}
		return sum;
	}
	
	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static double add(int a, double b) {
		return a+b;
	}
	
	public static long add(int a, long b) {
		return a+b;
	}
}
