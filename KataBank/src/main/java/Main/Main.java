package Main;

import Account.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        double retirar = 0;
        double deposito = 0;
        String fecha = "";
        Account account;
        account =new Account();
        int opcion;
        do {
            System.out.println("Eligir transaccion a realizar: "+
                    "\n" +"1. Depositar dinero"+
                    "\n" + "2. Retirar Dinero"+
                    "\n" + "3.Consultar saldo "+
                    "\n"+ "4.salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: System.out.println("Ingrese la cantidad de dinero a depositar");
                    deposito = scanner.nextDouble();
                    account.deposit(deposito,"10/01/2021");
                    System.out.println("Ingresaste: " + deposito);
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad de dinero a retirar");
                    retirar = scanner.nextDouble();
                    account.withdraw(retirar);
                    break;
                case 3:
                    account.printStatements(account.getBalance(), retirar);
                default: System.out.println();
            }
        }
        while ( opcion < 4);
            System.out.println("Saliste del servicio");
    }
}
