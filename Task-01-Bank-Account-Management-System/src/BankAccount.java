public class BankAccount 
{
    private String accountHolderName;
    private int accountNumber;
    private double balance;
    // Constructor
    public BankAccount(String accountHolderName, int accountNumber) 
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }
    // Deposit Method
    public void deposit(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid deposit amount!");
            return;
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
        System.out.println("Current Balance: ₹" + balance);
    }
    // Withdraw Method
    public void withdraw(double amount) 
    {
        if (amount <= 0) 
        {
            System.out.println("Invalid withdrawal amount!");
            return;
        }
        if (amount > balance) 
        {
            System.out.println("Insufficient Balance!");
            return;
        }
        balance -= amount;
        System.out.println("Withdrawal Successful.");
        System.out.println("Current Balance: ₹" + balance);
    }
    // Check Balance
    public void checkBalance() 
    {
        System.out.println("Current Balance: ₹" + balance);
    }
    // Display Account Details
    public void displayAccountDetails() 
    {
        System.out.println("\n===== ACCOUNT DETAILS =====");
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
    }
}