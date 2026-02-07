public class BankAccountClassPractice{
    public static void main(String[] args) {
        BankAccount bodhisattva = new BankAccount();
        bodhisattva.accountNumber = 564;
        bodhisattva.deposit(5000);
        bodhisattva.withdraw(3000);
        System.out.println(bodhisattva.getBalance());
        BankAccount rahul = new BankAccount();
        rahul.accountNumber = 6666;
        rahul.deposit(4000);
        rahul.withdraw(1000);
        System.out.println(rahul.getBalance());
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
}

