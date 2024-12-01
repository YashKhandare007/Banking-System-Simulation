
  public class Transaction {
    private String transactionType; // Deposit, Withdrawal, Transfer
    private String accountNumber;
    private double amount;
    private String details;

    // Constructor
    public Transaction(String transactionType, String accountNumber, double amount, String details) {
        this.transactionType = transactionType;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.details = details;
    }

    @Override
    public String toString() {
        return "Transaction: " + transactionType + ", Account: " + accountNumber +
               ", Amount: " + amount + ", Details: " + details;
    }
}


