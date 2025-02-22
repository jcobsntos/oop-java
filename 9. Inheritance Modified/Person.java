package core;

public abstract class Person {
	private String name, address;
	private int age;
	
	public abstract String advice();
	public abstract char bloodType();
	public abstract void pcSetup();
	
	public void personalityType() {
		System.out.println("What is your MBTI? Mine is INFJ");
	}
	public final void language() {
		System.out.println("I can speak multiple languages");
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public void setAddress(String address) {
		this.address=address;
	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
