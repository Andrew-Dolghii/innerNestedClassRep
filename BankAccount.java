package andrew.nestedClasses;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class BankAccount {
    private int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    static class Transaction{
        LocalDateTime timestamp;
        int amount;
        String type;

        public Transaction(LocalDateTime timestamp, int amount, String type) {
            this.timestamp = timestamp;
            this.amount = amount;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "timestamp=" + timestamp +
                    ", amount=" + amount +
                    ", type='" + type + '\'' +
                    '}';
        }
    }

    ArrayList<Transaction> transactions = new ArrayList<>();

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getBalance() {
        return balance;
    }

    void deposit(int amount){
        Transaction deposit = new Transaction(LocalDateTime.now(), amount, "deposit");
        balance += amount;
        transactions.add(deposit);
    }

    void withdraw(int amount){
        Transaction withdraw = new Transaction(LocalDateTime.now(), amount, "withdraw");
        balance -= amount;
        transactions.add(withdraw);
    }

    public static void main(String[] args) {
        BankAccount bank = new BankAccount(123, 200);

        System.out.println("Opening Balance: " + bank.getBalance());

        bank.deposit(50); //+50
        bank.withdraw(35); //-35
        bank.deposit(100); //+100
        bank.withdraw(40); //-40

        System.out.println("Closing Balance: " + bank.getBalance());

        System.out.println("\nTransactions: ");
        for(Transaction transaction : bank.getTransactions()){
            System.out.println(transaction + ", ");
        }

    }

}
