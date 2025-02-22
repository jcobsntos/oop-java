package core;

public final class Gamer extends Person {
	private String playGames;
	private String esports;
	
	public final void doingToday() {
		System.out.println("Practicing and Playing for the Semi-finals of LoL worlds");
	}
	public String advice() {
		String a = "Do not sit in and play games for several hours";
		return a;
	}
	public char bloodType() {
		char blood = 'A';
		return blood;
	}
	public void pcSetup() {
		System.out.println("Faker is sponsored by samsung odyssey, "
				+ "it runs the latest graphics and other specifications");
	}
	public Gamer() {
		super.language();
		super.personalityType();
		this.personalityType();
	}
	public void personalityType() {
		System.out.println("Mine is INTJ");
	}
	
	public String getPlayGames() {
		return playGames;
	}
	public void setPlayGames(String playGames) {
		this.playGames = playGames;
	}
	public String getEsports() {
		return esports;
	}
	public void setEsports(String esports) {
		this.esports = esports;
	}


	
}
