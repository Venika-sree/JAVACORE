package week1;

class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " successfully. New Balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " successfully. Remaining Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void transfer(Account targetAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
            targetAccount.setBalance(targetAccount.getBalance() + amount);
            System.out.println("Transferred $" + amount + " to account " + targetAccount.getAccountNumber() + ".");
        } else {
            System.out.println("Transfer failed: Insufficient funds.");
        }
    }

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + " | Balance: $" + balance);
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = getBalance() * interestRate;
        setBalance(getBalance() + interest);
        System.out.println("Interest of $" + interest + " added. New Balance: $" + getBalance());
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && (getBalance() + overdraftLimit) >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew $" + amount + " (Current Account). Remaining Balance: $" + getBalance());
        } else {
            System.out.println("Transaction declined: Exceeds overdraft limit.");
        }
    }
}

public class Bank{
    public static void main(String[] args) {
        System.out.println("--- Creating Accounts ---");
        SavingsAccount accSavings = new SavingsAccount("SAV101", 10000.0, 0.05);
        CurrentAccount accCurrent = new CurrentAccount("CUR202", 2000.0, 5000.0);

        System.out.println("\n--- Performing Savings Transactions ---");
        accSavings.displayDetails();
        accSavings.deposit(2000);
        accSavings.calculateInterest();

        System.out.println("\n--- Current Account Overdraft Test ---");
        accCurrent.displayDetails();
        accCurrent.withdraw(4500);

        System.out.println("\n--- Transfer Test ---");
        accSavings.transfer(accCurrent, 1500);

        System.out.println("\n--- Final Account States ---");
        accSavings.displayDetails();
        accCurrent.displayDetails();
    }
}
