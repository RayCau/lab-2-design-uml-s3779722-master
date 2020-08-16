package code;

public class Student {
	
	private int registration;
	private String name;
	
	public Student(int registration, String name) {
		this.registration = registration;
		this.name = name;
	}
	
	public int getRegistration() {
		return registration;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
