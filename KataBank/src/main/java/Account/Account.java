package Account;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {

    double balance = 0;
    double debit = 0;
    String date = "";

    public void deposit(double amount, String date) {
        balance += amount;
        this.date = date;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
    public void printStatements(double balance, double debit) {

        System.out.println("Este es su estado de cuenta:"
                +"\n"+  "debit: " +debit
                +"\n"+  "balance: " + balance );
    }
    public double getBalance() {
        return balance;
    }

}
