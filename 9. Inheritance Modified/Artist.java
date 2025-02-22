package core;

public final class Artist extends Person {
	private String makeArt;
	private String shareArt;
	
	public final int rate() {
		int rate = 10;
		return rate;
	}
	public final boolean java() {
		boolean isJavaFun = true;
		return isJavaFun;
	}
	public String advice() {
		String a ="Don't limit your imagination";
		return a;
	}
	public char bloodType() {
		char blood = 'O';
		return blood;
	}
	public void pcSetup() {
		System.out.println("My setup is an all in one pc with just average specifications");
		
	}
	public Artist() {
		super.personalityType();
		this.personalityType();
	}
	public void personalityType() {
		System.out.println("Mine is INFP");
	}
	
	public String getMakeArt() {
		return makeArt;
	}

	public void setMakeArt(String makeArt) {
		this.makeArt = makeArt;
	}

	public String getShareArt() {
		return shareArt;
	}

	public void setShareArt(String shareArt) {
		this.shareArt = shareArt;
	}
	
	
}
