package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;

import entities.heranca.Account;
import entities.heranca.BusinessAccount;
import entities.heranca.SavingsAccount;

public class BalanceAccount { // Declaração da classe BalanceAccount

    public static void main(String[] args) { // Método principal

        Locale.setDefault(Locale.US); // Define o local como EUA para formatação de números

        List<Account> list = new ArrayList<>(); // Lista para armazenar as contas bancárias

        // Adiciona diferentes tipos de contas à lista
        list.add(new SavingsAccount(1001, "Kauan", 500.00, 0.01)); // Adiciona uma conta de poupança à lista
        list.add(new BusinessAccount(1002, "Vitoria", 1000.0, 400.0)); // Adiciona uma conta empresarial à lista
        list.add(new SavingsAccount(1004, "Mike", 300.0, 0.01)); // Adiciona outra conta de poupança à lista
        list.add(new BusinessAccount(1005, "Boris", 500.0, 500.0)); // Adiciona outra conta empresarial à lista

        double sum = 0.0; // Variável para armazenar o saldo total das contas

        // Loop para calcular o saldo total das contas
        for (Account acc : list) {
            sum += acc.getBalance(); // Adiciona o saldo da conta atual à soma total
        }

        // Exibe o saldo total das contas
        System.out.printf("Total balance: %.2f%n", sum);

        // Loop para fazer um depósito de $10 em cada conta e exibir o saldo atualizado
        for (Account acc : list) {
            acc.deposit(10.0); // Faz um depósito de $10 na conta atual
        }
        for (Account acc : list) {
            System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance()); // Exibe o saldo atualizado da conta atual
        }
    }
}