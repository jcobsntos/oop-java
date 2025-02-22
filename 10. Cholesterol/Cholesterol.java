package activity;

public class Cholesterol {

	public int getCholesterolLevelHealthy(int[] cholesterol) {
		int healthy = 0;
		for (int i = 0; i < cholesterol.length; i++) {
			if(cholesterol[i] <= 200) {
				healthy++;
		}
		
	}
		return healthy;
}

	public int getCholesterolLevelBorderline(int[] cholesterol) {
		int borderline = 0;
		for (int i = 0; i < cholesterol.length; i++) {
			if(cholesterol[i] > 200 && cholesterol[i] < 240) {
				borderline++;
			}
		}
		return borderline;
	}

	public int getCholesterolLevelDangerous(int[] cholesterol) {
		int dangerous = 0;
		for (int i = 0; i < cholesterol.length; i++) {
			if(cholesterol[i] >= 240) {
				dangerous++;
			}
		}
		return dangerous;
	}
}
