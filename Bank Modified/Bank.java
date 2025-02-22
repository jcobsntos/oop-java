package week4;
import java.util.Scanner;
public class Bank {
	private Scanner sc = null;
	private double balance;

	public int menu() {
		sc = new Scanner(System.in);
		System.out.println("1) balance, 2) deposit, 3) withdrawal, 0) quit");
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		return choice;
	}
	
	public double getBalance() {
		return balance;
	}
	public double input(String msg) {
		System.out.print(msg);
		return sc.nextDouble();
	}
	public void setDeposit(double amount) {
		balance += amount;
	}
	public void setWithdrawal(double withdrawal) {
		balance -= withdrawal;
	}
}
	