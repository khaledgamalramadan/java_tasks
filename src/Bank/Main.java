package Bank;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		 Bank myBank = new Bank();
	        Scanner scanner = new Scanner(System.in);
	        
	        // إضافة حسابات
	        myBank.addAccount(new Account("1001", "John Doe", 5000));
	        myBank.addAccount(new Account("1002", "Jane Smith", 3000));
	        
	        System.out.println("\n--- Displaying All Accounts ---");
	        myBank.displayAllAccounts();

	        
	        System.out.println("\n--- Deposit Operation ---");
	        System.out.print("Enter Account ID: ");
	        String accountIDDeposit = scanner.nextLine();
	        System.out.print("Enter Amount to Deposit: ");
	        double amountDeposit = scanner.nextDouble();
	        myBank.depositToAccount(accountIDDeposit, amountDeposit);
	        
	     
	        System.out.println("\n--- Withdraw Operation ---");
	        scanner.nextLine();  
	        System.out.print("Enter Account ID: ");
	        String accountIDWithdraw = scanner.nextLine();
	        System.out.print("Enter Amount to Withdraw: ");
	        double amountWithdraw = scanner.nextDouble();
	        myBank.withdrawFromAccount(accountIDWithdraw, amountWithdraw);

	        System.out.println("\n--- Displaying All Accounts After Transactions ---");
	        myBank.displayAllAccounts();

	        scanner.close();
	        }

}
