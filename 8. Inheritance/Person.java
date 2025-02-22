package core;

public class Person {
	
	private String name, address;
	private int age;
	
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
