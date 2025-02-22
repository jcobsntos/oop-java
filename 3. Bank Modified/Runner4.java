package week4;

public class Runner4 {
	public static void main(String [] args) {
		Bank santos =  new Bank();
		int choice = -1;
		do {
			choice = santos.menu();
			switch(choice) {
			
			case 1:
				double balance = santos.getBalance();
				System.out.print("Current Balance: " + balance + "\n");
				break;
			
			case 2:
				for (double amount; true; amount++) {
					amount = santos.input("Enter amount to deposit: ");
					if (amount > 0) {
						santos.setDeposit(amount);
						System.out.print("Money successfully deposited...\n");
						break;
					}
					else {
						System.out.println("Invalid amount entered...");
					}
				}
				break;
			
			case 3:
				double withdrawal;
				do {
					if (santos.getBalance()==0){
						System.out.println("Not enough deposit to make withdrawal" + " current balance is " + santos.getBalance());
						break;
					}
					withdrawal = santos.input("Enter amount to withdraw: ");
					if (withdrawal > santos.getBalance() || withdrawal < 1) {
						System.out.print("Amount entered is invalid" + " current balance is " + santos.getBalance() + "\n");
						continue;
					}
					else {
						santos.setWithdrawal(withdrawal);
						System.out.print("Withdrawal complete...\n");
						break;
					}
				} while(true);
						break;
				
			case 0:
				System.out.print("Closing Balance: " + santos.getBalance() + "\nThank you for banking with us...");
				break;
			
			default:
				System.out.print("Option is not available in the selection list...\n");
			}
			
			} while(choice !=0);
		
		
	}

}





