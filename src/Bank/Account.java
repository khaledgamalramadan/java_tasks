package Bank;



// الفئة Account لتمثيل تفاصيل حساب العميل
class Account {
    private String accountID;
    private String customerName;
    private double balance;

    // المُنشئ لحساب جديد
    public Account(String accountID, String customerName, double balance) {
        this.accountID = accountID;
        this.customerName = customerName;
        this.balance = balance;
    }

    // طريقة لإيداع المال
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // طريقة لسحب المال
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance.");
        }
    }

    // طرق للحصول على القيم
    public String getAccountID() {
        return accountID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    // طريقة لعرض تفاصيل الحساب
    public void displayAccountDetails() {
        System.out.println("Account ID: " + accountID + ", Customer: " + customerName + ", Balance: " + balance);
    }
}
