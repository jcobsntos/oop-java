package core;

public class Runner {
	public static void main(String[] args) {
	Gamer gamer = new Gamer();
	gamer.setName("Faker");
	gamer.setAddress("Seoul, South Korea");
	gamer.setAge(27);
	gamer.setPlayGames("League of Legends");
	gamer.setEsports("LCK, MSI, Worlds International");
	
	String adviceGamer = gamer.advice();
	char bloodTypeGamer = gamer.bloodType();
	gamer.pcSetup();
	gamer.doingToday();
	System.out.println("Faker's advice: " + adviceGamer);
	System.out.println("Blood Type: " + bloodTypeGamer +"\n");
	
	Artist artist = new Artist();
	artist.setName("Jacob");
	artist.setAddress("Tondo, Manila");
	artist.setAge(19);
	artist.setMakeArt("Digital Illustrations");
	artist.setShareArt("Twitter, Pixiv, Facebook, Instagram");
	
	String adviceArtist = artist.advice();
	char bloodTypeArtist = artist.bloodType();
	int rateProgramming = artist.rate();
	boolean isJavaFun = artist.java();
	artist.pcSetup();
	System.out.println("My advice: " + adviceArtist);
	System.out.println("Blood type: " + bloodTypeArtist);
	System.out.println("Rate programming course /10: " + rateProgramming);
	System.out.println("Is java fun?: " + isJavaFun);

	}
}
