package Oopss_Concept;

public class Student {
	private String name = "kaju" ;
	private int age = 8;
	
	public Student () {
		
	}
	
	public Student (String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) throws Exception{
		try {
		if(age < 0) {
			throw new Exception ("age can not be -ve");
			
		}
		this.age = age;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("I am finally block");
		}
	}
	
//	public void setAge(int age) throws Exception{
//		if(age < 0) {
//			throw new Exception ("age can not be -ve");
//			
//		}
//		this.age = age;
//	}
}
