import java.util.Scanner;

class Customer {
    String name;
    String customerId;

    Customer(String name, String customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }
}

class Account {
    String accountNumber;
    double balance;

    Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class RBI {
    double rateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    double rateOfInterest() {
        return 6.5;
    }
}

class ICICI extends RBI {
    @Override
    double rateOfInterest() {
        return 7.0;
    }
}

class PNB extends RBI {
    @Override
    double rateOfInterest() {
        return 6.75;
    }
}

public class BankProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Customer ID: ");
        String customerId = sc.nextLine();

        Customer customer = new Customer(name, customerId);

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Balance: ");
        double balance = sc.nextDouble();

        Account account = new Account(accountNumber, balance);

        sc.nextLine();

        System.out.print("Enter the Bank name to find the rate of Interest: ");
        String bankName = sc.nextLine();

        RBI bank;

        if (bankName.equalsIgnoreCase("RBI")) {
            bank = new RBI();
        } else if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } else if (bankName.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        } else if (bankName.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        } else {
            System.out.println("Invalid bank name.");
            sc.close();
            return;
        }

        System.out.println();
        customer.displayCustomer();
        account.displayAccount();

        System.out.println("Rate of Interest: " + bank.rateOfInterest() + "%");

        sc.close();
    }
}