import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" BANK ACCOUNT MANAGEMENT SYSTEM ");
        System.out.println("====================================");
        // Account Creation
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();
        BankAccount account = new BankAccount(name, accountNumber);
        int choice;
        do 
        {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Details");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.print("Enter Deposit Amount:");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter Withdrawal Amount:s");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                case 4:
                    account.displayAccountDetails();
                    break;
                case 5:
                    System.out.println("Thank You For Using Our Banking System!");
                    break;
                default:
                    System.out.println("Invalid Choice! Please Try Again.");
            }
        } while (choice != 5);
        sc.close();
    }
}