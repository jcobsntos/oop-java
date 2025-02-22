package core;

public class Runner {
		public static void main(String[] args) {
			Gamer gamer = new Gamer();
			gamer.setName("Faker");
			gamer.setAddress("Seoul, South Korea");
			gamer.setAge(27);
			gamer.setPlayGames("League of Legends");
			gamer.setEsports("LCK, MSI, Worlds International");
			
			System.out.println("Gamer");
			System.out.println("Name: " + gamer.getName());
			System.out.println("Address: " + gamer.getAddress());
			System.out.println("Age: " + gamer.getAge());
			System.out.println("Competitive Game: " + gamer.getPlayGames());
			System.out.println("Esports: " + gamer.getEsports() + "\n");
			
			Artist artist = new Artist();
			artist.setName("Jacob");
			artist.setAddress("Tondo, Manila");
			artist.setAge(19);
			artist.setMakeArt("Digital Illustrations");
			artist.setShareArt("Twitter, Pixiv, Facebook, Instagram");
			
			System.out.println("Artist");
			System.out.println("Name: " + artist.getName());
			System.out.println("Address: " + artist.getAddress());
			System.out.println("Age: " + artist.getAge());
			System.out.println("Type of Art: " + artist.getMakeArt());
			System.out.println("Mode of Sharing/Uploading: " + artist.getShareArt());
			
			
			
			
		}
}
