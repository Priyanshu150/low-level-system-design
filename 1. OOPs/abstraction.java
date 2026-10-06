abstract class BankAccount {
    private double balance; // Hidden data (internal details)

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    // Exposing only necessary operations
    public void deposit(double amount) {
        balance += amount;
    }
    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public double getBalance() {
        return balance;
    }
    // Abstract method - must be implemented by subclasses
    public abstract void showAccountType();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    @Override
    public void showAccountType() {
        System.out.println("Savings Account");
    }
}
