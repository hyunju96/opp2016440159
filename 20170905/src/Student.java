
public class Student {
	int age;
	String name;
	
	void printage() {
		System.out.println("The age is " + age);	
	}
	
	void printname() {
		System.out.println("The name is " + name);
	}
	
	public Student(int a, String b) {
		age = a;
		name = b;
	}
}
