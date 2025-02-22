package week5;

public class Ferson {

	private String name, address, hobby, personalityType;
	private int age;
	private char sex;
	
	public Ferson(String name, String address, int age, char sex, String hobby, String personalityType) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.hobby = hobby;
		this.personalityType = personalityType;
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
	public char getSex() {
		return sex;
	}
	public String getHobby() {
		return hobby;
	}
	public String getPersonalityType() {
		return personalityType;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public  void setAge(int age) {
		this.age = age;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public void setPersonalityType(String personalityType) {
		this.personalityType = personalityType;
	}
	
}
	

