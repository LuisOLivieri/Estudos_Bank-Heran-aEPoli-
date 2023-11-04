package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        Account acc10 = new Account(13563, "Luis", 1000.0);
        BusinessAccount bacc = new BusinessAccount(13585, "Maria", 0.0, 500.0);

        //UPCASTING - PEGA UM OBJETO E ATRIBUI A UMA VARIAVEL (BusinessAccount vira uma variavel de Account)
        //Uma conta Empresarial tambem e uma conta
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Luis", 0.0, 200.00);
        Account acc3 = new SavingsAccount(1004, "Ana", 0.0, 0.01);

        //DOWNCASTING Converter da superClasse para a subclasse
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200.00);
            System.out.println("Loan!");
        }
        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }

        acc10.withdraw(200.0);
        System.out.println(acc10.getBalance());

        Account acc11 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc11.withdraw(200.00);
        System.out.println(acc11.getBalance());

        Account acc12 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc12.withdraw(200.0);
        System.out.println(acc12.getBalance());


    }
}