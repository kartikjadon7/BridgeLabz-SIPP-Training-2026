


class Bank {
    String holder;
    int accountNumber;
    double balance;

     static int totalAccounts = 0;

    Bank(int accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    void getStatment() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + holder + ", Balance: " + balance);
    }

}




public class BankAccount {
    public static void main(String []args){

    }
    
    
}
