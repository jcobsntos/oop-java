package combinations;

public class Combinations {
	public int summation(int[] array) {
		int k = 8;
		System.out.println("Numbers equal to k are");
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length; j++) {
					if(array[i] + array[j] == k) {
						System.out.println(array[i]+ " + "+array[j]+" = "+ k);
					}
			}
		}
		return k;
	}
}

