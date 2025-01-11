package Oopss_Concept;

public class Student {
	String name = "Kaju";
	int age = 22;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + " " + age;
	}
	
	
	public static void main(String[] args) {
		Student s = new Student("Kaju", 22);
		Student s1 = new Student("Ankit", 23);
		
		System.out.println(s);
		System.out.println(s1);
	}
}
