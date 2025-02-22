package week4;

public class Runner5 {
	
	public static void main(String[] args) {
		String[] days = {"Monday", "Tuesday","Wednesday","Thursday",
				"Friday","Saturday","Sunday","Good Friday"};
		
		for (String s : days) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (int i = 0; i < days.length; i++) {
			System.out.print(days[i] + " ");
		}
		System.out.println();
		int[] num = new int[4];
		for (int i = 0; i < num.length; i++) {
		num[i]= i + 1;
		System.out.print(i + " ");
	    }
		System.out.println();
		for (int i : num) {
			System.out.print(i + " ");
		}
  
	}

}
