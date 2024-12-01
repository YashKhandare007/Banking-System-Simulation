
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    BankingSystem bank = new BankingSystem();
    Scanner scanner = new Scanner(System.in);

    while (true) {
      System.out.println("\n--- Banking System Menu ---");
      System.out.println("1. Create Account");
      System.out.println("2. Delete Account");
      System.out.println("3. Deposit");
      System.out.println("4. Withdraw");
      System.out.println("5. Transfer");
      System.out.println("6. View Account");
      System.out.println("7. View Transactions");
      System.out.println("8. Exit");
      System.out.print("Choose an option: ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline

      switch (choice) {
        case 1:
          System.out.print("Enter account number: ");
          String accNum = scanner.nextLine();
          System.out.print("Enter account holder name: ");
          String accHolder = scanner.nextLine();
          System.out.print("Enter initial balance: ");
          double initBalance = scanner.nextDouble();
          bank.createAccount(accNum, accHolder, initBalance);
          break;
        case 2:
          System.out.print("Enter account number to delete: ");
          accNum = scanner.nextLine();
          bank.deleteAccount(accNum);
          break;
        case 3:
          System.out.print("Enter account number: ");
          accNum = scanner.nextLine();
          System.out.print("Enter deposit amount: ");
          double deposit = scanner.nextDouble();
          bank.deposit(accNum, deposit);
          break;
        case 4:
          System.out.print("Enter account number: ");
          accNum = scanner.nextLine();
          System.out.print("Enter withdrawal amount: ");
          double withdrawal = scanner.nextDouble();
          bank.withdraw(accNum, withdrawal);
          break;
        case 5:
          System.out.print("Enter source account: ");
          String fromAcc = scanner.nextLine();
          System.out.print("Enter destination account: ");
          String toAcc = scanner.nextLine();
          System.out.print("Enter transfer amount: ");
          double transferAmount = scanner.nextDouble();
          bank.transfer(fromAcc, toAcc, transferAmount);
          break;
        case 6:
          System.out.print("Enter account number: ");
          accNum = scanner.nextLine();
          bank.viewAccount(accNum);
          break;
        case 7:
          bank.viewTransactions();
          break;
        case 8:
          System.out.println("Exiting...");
          scanner.close();
          System.exit(0);
        default:
          System.out.println("Invalid choice.");
      }
    }
  }
}
