package entities.HerancaPolimorfismo;

public class Account {
	
	private Integer number; // Número da conta
	private String holder; // Titular da conta
	protected Double balance; // Saldo da conta (protected para permitir acesso pelas subclasses)
		
	// Construtor padrão
	public Account() {
	}
	
	// Construtor com parâmetros
	public Account(Integer number, String holder, Double balance) {
		this.number = number; // Inicializa o número da conta
		this.holder = holder; // Inicializa o titular da conta
		this.balance = balance; // Inicializa o saldo da conta
	}

	// Método para obter o número da conta
	public Integer getNumber() {
		return number;
	}

	// Método para definir o número da conta
	public void setNumber(Integer number) {
		this.number = number;
	}

	// Método para obter o titular da conta
	public String getHolder() {
		return holder;
	}

	// Método para definir o titular da conta
	public void setHolder(String holder) {
		this.holder = holder;
	}

	// Método para obter o saldo da conta
	public Double getBalance() {
		return balance;
	}

	// Método para realizar um saque
	public void withdraw(double amount) {
		balance -= amount + 5.0; // Subtrai o valor do saque do saldo, adicionando uma taxa de 5.0
	}

	// Método para realizar um depósito
	public void deposit(double amount) {
		balance += amount; // Adiciona o valor do depósito ao saldo
	}
}