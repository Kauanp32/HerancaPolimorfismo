package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import entities.heranca.BusinessAccount;

public class Balance1 { // Declaração da classe Balance1

    public static void main(String[] args) { // Método principal

        // Cria uma nova instância de BusinessAccount com os parâmetros fornecidos
        BusinessAccount account = new BusinessAccount(8010, "Bob Brown", 0.0, 500.0);

        // Imprime o saldo inicial da conta
        System.out.println(account.getBalance());
    }
}