package week3;
import java.util.Scanner;

//JACOB S. SANTOS BSCOE 2-1

public class Bank {
	public static int js(String[] args) {
			
			int balance = 0, deposit, withdrawal = 0;
			try (Scanner sc = new Scanner(System.in)) {
				while(true) {
					
					System.out.println();
					System.out.println("Enter");
					System.out.println("1) " + "Balance");
					System.out.println("2) " + "Deposit");
					System.out.println("3) " + "Withdrawal");
					System.out.println("0) " + "Quit");
					System.out.print("Enter choice [0-3]: ");
					
					int n = sc.nextInt();
					
					switch(n) {
					
					case 0: 
						System.out.println("");
						System.out.print("Closing Balance: " + balance);
						System.out.println("");
						System.exit(n);
						
					case 1: 
						System.out.println("");
						System.out.println("Current Balance: " + balance);
						System.out.println("");
						break;
					
					case 2: 
						System.out.println("");
						System.out.println("Deposit Amount: ");
						deposit = sc.nextInt();
						balance = balance + deposit;
						System.out.println("Money Successfully Deposited ");
						System.out.println(" ");
						break;
						
					case 3: 
						System.out.println("");
						System.out.println("Amount to Withdraw: ");
						withdrawal = sc.nextInt();
						if(balance >= withdrawal) {
							
							balance = balance - withdrawal;
							System.out.println("");
							System.out.println("Current balance: " + balance);
							
						}
						else {
							System.out.println("");
							System.out.println("Insufficient Money");
						}
						System.out.println(" ");
						break;
					
					
					
					}
				}
			}

}


}
