package Main;

import Account.Account;

public class Main {
    public static void main(String[] args) {
        /**
         * Creacion Objeto account de tipo Account
         */
        Account account;
        account =new Account();

        account.deposit(1000,("10/01/2021"));
        account.deposit(2000, ("13/01/2021"));
        account.withdraw(500, "14/01/2021");
        account.printStatements(3000, 500);
    }
}
