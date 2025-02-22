package week4;

//JACOB S. SANTOS BSCOE 2-1
public class Arrays {
	
	public static void main(String[] args) {
		int[] scores = {80,75,100,90,74};
//		int[] scores = {80,75,90,74};
//     	int[] scores = {-1,0,-5};
		
		    System.out.print("Example scores: ");
		for (int i = 0; i < scores.length; i++) {
			System.out.print(scores[i] + " ");
			}
		    System.out.println();
		
		int highest = Integer.MIN_VALUE, lowest = Integer.MAX_VALUE;
		int s = 0;
		while(s < scores.length) {
			   if (scores[s] > highest) 
				   highest = scores[s];
			       if (scores[s] < lowest) 
			   		   lowest = scores[s];
			       		s++;
			       
        }
			System.out.println("\nHighest score = " + highest);
			System.out.println("Lowest score = " + lowest + "\n");
			
		System.out.print("Numbers greater or equal to 75 are: ");
		double average = 0, sum = 0;
		for (int i = 0; i<scores.length; i++) {
		if (scores[i] >= 75 && scores[i] <= 100 ) {
			System.out.print(scores[i] + " ");
			sum += scores[i];
		    }
		}
		if (scores.length == 5) {
			int[] num = new int[4];
			for (int i = 0; i < num.length; i++) {
				average = sum / num.length;
				}
				System.out.println("\nAverage score = " + average);  
			}	  
		else if (scores.length == 4) {
			int[] num = new int[3];
			for (int i = 0; i < num.length; i++) {
				average = sum / num.length;
				}
				System.out.println("\nAverage score = " + average);  
			}
		else if (scores.length == 3){
			int[] num = new int[2];
			for (int i = 0; i < num.length; i++) {
				average = sum / num.length;
				}
				System.out.println("\nAverage score = " + average);  
			}
			
		}
	}




			


