package core;

public class Hercules extends Mortal implements Warrior, Equipment{
	
	public Hercules() {
		this.spears();
	}
	public void attack() {
		System.out.println("Slash/Punch...");
		
	}
	public void defend() {
		System.out.println("Shield...");
		
	}
	public void spears() {
		System.out.println("Throws...");
		
	}
	public void canBeKilled() {
		System.out.println("It takes thousands of armies to kill me...");
	}
}
