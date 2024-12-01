public class Accounts {
  public class Account {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public Account(String accountNumber, String accountHolderName, double initialBalance) {
      this.accountNumber = accountNumber;
      this.accountHolderName = accountHolderName;
      this.balance = initialBalance;
    }

    // Getters and Setters
    public String getAccountNumber() {
      return accountNumber;
    }

    public String getAccountHolderName() {
      return accountHolderName;
    }

    public double getBalance() {
      return balance;
    }

    // Deposit method
    public void deposit(double amount) {
      if (amount > 0) {
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
      } else {
        System.out.println("Invalid deposit amount.");
      }
    }

    // Withdraw method
    public boolean withdraw(double amount) {
      if (amount > 0 && balance >= amount) {
        balance -= amount;
        System.out.println("Withdrawal successful! New balance: " + balance);
        return true;
      } else {
        System.out.println("Insufficient balance or invalid amount.");
        return false;
      }
    }
  }

}
