package ThisStaticFinalInstancOf;

public class Q1 {
    static String bankName = "ABC Bank";
    private static int totalAccounts = 0;

    // Instance + Final
    private String accountHolderName;
    private final int accountNumber;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {  // Using instanceof
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        }
    }
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Farhan", 111);
        BankAccount acc2 = new BankAccount("Yasir", 122);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        System.out.println();
        BankAccount.getTotalAccounts();
    }
}