public class BankAccount {
   
    private String accountHolder;
    private String accountNumber;
    private double balance;


    public BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.printf("Successfully deposited $%.2f.\n", amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > this.balance) {
            System.out.println("Insufficient funds. Withdrawal denied.");
        } else {
            this.balance -= amount;
            System.out.printf("Successfully withdrew $%.2f.\n", amount);
        }
    }


    public void displayBalance() {
        System.out.printf("Account Holder: %s | Account: %s | Current Balance: $%.2f\n",
                this.accountHolder, this.accountNumber, this.balance);
    }

    public static void main(String[] args) {
      
        BankAccount myAccount = new BankAccount("John Smith", "123456789", 500.00);

    
        myAccount.displayBalance(); 
        myAccount.deposit(150.50);  
        myAccount.displayBalance(); 
        myAccount.withdraw(200.00); 
        myAccount.displayBalance();
        myAccount.withdraw(500.00); 
        myAccount.displayBalance(); 
    }
}