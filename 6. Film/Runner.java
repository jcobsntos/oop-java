package movieactivity;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Movie shrek = new Movie("Shrek", 133);
		Movie rtp = new Movie("Road to Perdition", 117);
		Movie enigma = new Movie("Enigma", 113);
		Movie ttacad = new Movie("The Truth about Cats and Dogs", 93);

		System.out.println("Title" + " " + "Duration");
		System.out.println(shrek.getTitle() + " \\ " + shrek.getDuration());
		System.out.println(rtp.getTitle() + " \\ " + rtp.getDuration());
		System.out.println(enigma.getTitle() + " \\ " + enigma.getDuration());
		System.out.println(ttacad.getTitle() + " \\ " + ttacad.getDuration()+"\n");
	
		
		Film longestFilm = new Film();

		System.out.println(longestFilm.movieList(args));
	}

}
