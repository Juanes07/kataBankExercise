package Account;

public class Account {

    double totalBalance = 0;
    String date = "";


    /**
     * metodo para ingresar valor a balance total ingresando fecha
     *
     * @param amount
     * @param date
     */
    public void deposit(double amount, String date) {
        totalBalance += amount;
        this.date = date;
    }

    /**
     * metodo para restar valor a su balance totall, ingresando fecha
     *
     * @param amount
     * @param date
     */
    public void withdraw(double amount, String date) {
        totalBalance -= amount;
    }

    /**
     * metodo para imprimir estado de cuenta
     *
     * @param credit
     * @param debit
     */

    public void printStatements(double credit, double debit) {
        totalBalance = credit - debit;
        System.out.println("Este es su estado de cuenta:"
                + "\n" + "Credit: " + credit + " || 10/01/2021 || 13/01/2021"
                + "\n" + "Debit: " + debit + " || 14/01/2021 "
                + "\n" + "Balance: " + totalBalance);
    }
}
