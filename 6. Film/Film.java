package movieactivity;

public class Film  {
	  private String title;
	  private int duration;

	public Film(String title, int duration) {
		  this.title = title;
		  this.duration = duration;
  	}
	public Film() {
	}
	public String getTitle() {
		return title;
	}
	public int getDuration() {
		return duration;
	}
	public int movieList(String[] args) {
	        Film movie[] = new Film[4];
	        movie[0] = new Film("Shrek",133);
	        movie[1] = new Film("Road to Predition",117);
	        movie[2] = new Film ("Enigma", 113);
	        movie[3] = new Film("The Truth about Cats and Dogs",93);
	        
	        Film longestFilm = null;
	        int longest = 0;
	        for(int i=0; i<movie.length; i++) {
	        	int duration1 = movie[i].getDuration();
	        	if (duration1 > longest) {
	        		longest = duration1;
	        		longestFilm = movie[i];
	        	}
	        }
	        System.out.print("The longest Movie is " + longestFilm.getTitle()+ " at ");
			return longest;
			
	    }
	
}