class BankAccount {
  // Access modifiers for BankAccount class
  public String accountNumber;
  protected String accountHolder;
  private double balance;

  // Public methods to access and modify balance
  public double getBalance() {
      return balance;
  }

  public void deposit(double amount) {
      balance += amount;
  }
}

class SavingsAccount extends BankAccount {
  // Access protected member 'accountHolder' in subclass
  public void displayAccountDetails() {
      System.out.println("Account Holder: " + accountHolder);
  }

  public static void main(String[] args) {
      SavingsAccount savingsAccount = new SavingsAccount();
      savingsAccount.accountNumber = "12345";
      savingsAccount.accountHolder = "Alice";
      savingsAccount.deposit(500);
      savingsAccount.displayAccountDetails();
      System.out.println("Balance: $" + savingsAccount.getBalance());
  }
}
