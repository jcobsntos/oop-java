package core;

import java.util.Random;

public class Barracks {
	public Warrior createRandomWarrior() {
		Warrior warrior = null;
		Random random = new Random();
		int number = random.nextInt(3);
		if(number==0) {
			warrior = new Knight();
		}
		else if(number==1) {
			warrior = new Spartan();
		}
		else if(number==2) {
			warrior = new Hercules();
		}
		return warrior;
		
	}
}
