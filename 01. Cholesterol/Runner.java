package activity;

import java.util.Scanner;

public class Runner {
	private static Scanner scanner;

	public static void main(String[] args) {
		Cholesterol ldl = new Cholesterol();
		int patients = 0;
		do {
		scanner = new Scanner(System.in);
		int[] cholesterol = new int[10];
		System.out.println("Enter Patients' Cholesterol Levels, Enter 0 to quit ");
		for(int i = 0; i < cholesterol.length; i++) {
			System.out.print("Enter Cholesterol Levels: ");
			cholesterol[i] = scanner.nextInt();
		switch (cholesterol[i]) {
		case 0:
			int healthy = ldl.getCholesterolLevelHealthy(cholesterol);
			int borderline = ldl.getCholesterolLevelBorderline(cholesterol);
			int dangerous = ldl.getCholesterolLevelDangerous(cholesterol);
			System.out.println("Healthy Patients: " + healthy);
			System.out.println("Borderline Patients: " + borderline);
			System.out.println("Dangerous Patients: " + dangerous +"\n");
			break;
				}
			}
		} while (patients == 0);
	}
}


