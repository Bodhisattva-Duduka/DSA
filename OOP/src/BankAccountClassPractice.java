public class BankAccountClassPractice{
    public static void main(String[] args) {
        // BankAccount bodhisattva = new BankAccount();
        // bodhisattva.accountNumber = 564;
        // bodhisattva.deposit(5000);
        // bodhisattva.withdraw(3000);
        // System.out.println(bodhisattva.getBalance());
        // BankAccount rahul = new BankAccount();
        // rahul.accountNumber = 6666;
        // rahul.deposit(4000);
        // rahul.withdraw(1000);
        // System.out.println(rahul.getBalance());


        // Task 1:
        BankAccount bodhisattva = new BankAccount(564, 2000);
        BankAccount rahul = new BankAccount(666, 1500);
        System.out.println(bodhisattva.balance);
        System.out.println(rahul.balance);

        
    }
}
class BankAccount {
    int accountNumber ;
    double balance;

    void deposit(int amount){
        balance += amount;
    }

    void withdraw(int amount){
        balance -= amount;
    }

    double getBalance(){
        return balance;
    }

    BankAccount(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

// Task 1: Parameterized Constructor

// Modify your BankAccount class.

// Requirements

// Account must have:
//       accountNumber
//       initialBalance
// These must be set at object creation
// No account should exist without them

// ----------------------------------------------------

