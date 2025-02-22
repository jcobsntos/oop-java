package core;

public class RunnerWarrior {
	public static void main(String[] args) {
		Barracks barracks = new Barracks();
		System.out.println("Either 1) Knight, 2) Spartan, or 3) Hercules");
		Warrior warrior = barracks.createRandomWarrior();
		warrior.attack();
		warrior.defend();
		
		System.out.println("\nKnight:");
		Knight knight = new Knight();
		knight.attack();
		knight.defend();
		
		System.out.println("\nSpartan:");
		Spartan spartan = new Spartan();
		spartan.attack();
		spartan.defend();
		spartan.spears();
		spartan.canBeKilled();
		
		System.out.println("\nHercules:");
		Hercules hercules = new Hercules();
		hercules.attack();
		hercules.defend();
		hercules.spears();
		hercules.canBeKilled();
		
	}
}
