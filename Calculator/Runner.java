package week2;

public class Runner {
	public static void main(String[] args) {
		int sum = Calc.add(10, 12);
		int diff = Calc.diff(10, 15);
		double mult = Calc.mult(8, 9);
		float div  = Calc.div(10, 10);
		float mod = Calc.mod(2, 3);
		double abs = Calc.abs(10, 15);
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mult);
		System.out.println(div);
		System.out.println(mod);
		System.out.println(abs);
	}
}

