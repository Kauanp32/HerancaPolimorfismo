package entities.HerancaPolimorfismo;

public class SavingsAccount extends Account {

    private Double interestRate; // Taxa de juros da conta poupança

    // Construtor padrão
    public SavingsAccount() {
        super(); // Chama o construtor da classe pai (Account)
    }

    // Construtor com parâmetros
    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance); // Chama o construtor da classe pai (Account) e passa os parâmetros necessários
        this.interestRate = interestRate; // Inicializa a taxa de juros
    }

    // Método para obter a taxa de juros
    public Double getInterestRate() {
        return interestRate;
    }

    // Método para definir a taxa de juros
    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    // Método para atualizar o saldo com base na taxa de juros
    public void updateBalance() {
        balance += balance * interestRate; // Adiciona o valor dos juros ao saldo
    }

    // Método de saque
    @Override
    public void withdraw(double amount) {
        balance -= amount; // Subtrai o valor do saque do saldo
    }
}