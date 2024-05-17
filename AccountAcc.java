package HerancaPolimorfismo; // Declaração do pacote onde a classe está localizada

import entities.heranca.Account;
import entities.heranca.BusinessAccount;
import entities.heranca.SavingsAccount;

public class AccountAcc { // Declaração da classe AccountAcc

    public static void main(String[] args) { // Método principal

        // Cria uma conta comum e uma conta empresarial
        Account acc = new Account(1001, "Kauan", 0.0); // Cria uma conta comum
        BusinessAccount bacc = new BusinessAccount(1002, "Vitoria", 0.0, 500.0); // Cria uma conta empresarial
        
        // UPCASTING
        
        Account acc1 = bacc; // Upcasting: uma subclasse (BusinessAccount) é atribuída a uma superclasse (Account)
        Account acc2 = new BusinessAccount(1003, "Mike", 0.0, 200.0); // Outro exemplo de upcasting
        Account acc3 = new SavingsAccount(1004, "Boris", 0.0, 0.01); // Mais um exemplo de upcasting
        
        // DOWNCASTING
        
        BusinessAccount acc4 = (BusinessAccount) acc2; // Downcasting: uma superclasse (Account) é convertida de volta para uma subclasse (BusinessAccount)
        acc4.loan(100.0); // Chamada de método específico da classe BusinessAccount
        
        // Verifica se acc3 pode ser convertida para BusinessAccount
        if (acc3 instanceof BusinessAccount) { // Verifica se acc3 é uma instância de BusinessAccount
            BusinessAccount acc5 = (BusinessAccount) acc3; // Se for, faz downcasting
            acc5.loan(200.0); // Chamada de método específico da classe BusinessAccount
            System.out.println("Loan!"); // Imprime uma mensagem indicando que o empréstimo foi feito
        }
        
        // Verifica se acc3 pode ser convertida para SavingsAccount
        if (acc3 instanceof SavingsAccount) { // Verifica se acc3 é uma instância de SavingsAccount
            SavingsAccount acc5 = (SavingsAccount) acc3; // Se for, faz downcasting
            acc5.updateBalance(); // Chamada de método específico da classe SavingsAccount
            System.out.println("Update!"); // Imprime uma mensagem indicando que o saldo foi atualizado
        }
    }
}