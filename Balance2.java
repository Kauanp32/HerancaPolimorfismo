package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import entities.heranca.Account;
import entities.heranca.BusinessAccount;
import entities.heranca.SavingsAccount;

public class Balance2 { // Declaração da classe Balance2

    public static void main(String[] args) { // Método principal

        // Cria uma conta comum e faz um saque
        Account acc1 = new Account(1001, "Kauan", 1000.0); // Cria uma nova conta comum
        acc1.withdraw(200.0); // Faz um saque de $200 da conta
        System.out.println(acc1.getBalance()); // Exibe o saldo atual da conta

        // Cria uma conta de poupança e faz um saque
        Account acc2 = new SavingsAccount(1002, "Vitoria", 1000.0, 0.01); // Cria uma nova conta de poupança
        acc2.withdraw(200.0); // Faz um saque de $200 da conta
        System.out.println(acc2.getBalance()); // Exibe o saldo atual da conta

        // Cria uma conta empresarial e faz um saque
        Account acc3 = new BusinessAccount(1003, "Mike", 1000.0, 500.0); // Cria uma nova conta empresarial
        acc3.withdraw(200.0); // Faz um saque de $200 da conta
        System.out.println(acc3.getBalance()); // Exibe o saldo atual da conta
    }
}