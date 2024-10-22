package Bank;
import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts = new ArrayList<>();

   
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added for " + account.getCustomerName());
    }

    public void removeAccount(String accountID) {
        for (Account account : accounts) {
            if (account.getAccountID().equals(accountID)) {
                accounts.remove(account);
                System.out.println("Account with ID " + accountID + " removed.");
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void depositToAccount(String accountID, double amount) {
        for (Account account : accounts) {
            if (account.getAccountID().equals(accountID)) {
                account.deposit(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void withdrawFromAccount(String accountID, double amount) {
        for (Account account : accounts) {
            if (account.getAccountID().equals(accountID)) {
                account.withdraw(amount);
                return;
            }
        }
        System.out.println("Account not found.");
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts in the bank.");
        } else {
            for (Account account : accounts) {
                account.displayAccountDetails();
            }
        }
    }
}