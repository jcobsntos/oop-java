package core;

public class Spartan extends Mortal implements Warrior, Equipment {
	
	public Spartan() {
		super.canBeKilled();
		this.spears();
	}
	
	public void attack() {
		System.out.println("Lets go SPARTANS!!! Stab...");
		
	}

	public void defend() {
		System.out.println("Shield...");
		
	}
	public void spears() {
		System.out.println("Poke...");
		
	}

}
