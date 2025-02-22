package combinations;

public class Runner {

	public static void main(String[] args) {
		int[] A = {1,8,3,0,1,3,-2,4,5};
		Combinations com = new Combinations();
		int combi = com.summation(A);
		System.out.println("This are the numbers equal to k = " + combi);
		
	}
}