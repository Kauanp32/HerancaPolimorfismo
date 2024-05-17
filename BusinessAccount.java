package entities.HerancaPolimorfismo;

public class BusinessAccount extends Account {
	
	private Double loanLimit; // Limite de empréstimo
	
	// Construtor padrão
	public BusinessAccount() {
		super(); // Chama o construtor da classe principal (Account)
	}

	// Construtor com parâmetros
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // Chama o construtor da classe pai (Account) e passa os parâmetros necessários
		this.loanLimit = loanLimit; // Inicializa o limite de empréstimo
	}

	// Método para obter o limite de empréstimo
	public Double getLoanLimit() {
		return loanLimit;
	}

	// Método para definir o limite de empréstimo
	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	// Método para realizar um empréstimo
	public void loan(double amount) {
		if (amount <= loanLimit) { // Verifica se o valor do empréstimo é menor ou igual ao limite de empréstimo
			balance += amount - 10.0; // Adiciona o valor do empréstimo ao saldo, subtraindo uma taxa de 10.0
		}
	}	
		
	// Método para realizar um saque
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount); // Chama o método withdraw da classe pai (Account)
		balance -= 2.0; // Subtrai uma taxa de 2.0 do saldo após o saque
	}
}