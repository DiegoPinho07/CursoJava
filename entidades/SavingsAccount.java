package entidades;

//associando a subclasse SavingsAccount à superclasse Account
public class SavingsAccount extends Account {
	
	//Criando o objeto de juros sob o capital investido na conta poupança
	private Double interestRate;
	
	//Criando construtores sem argumentos somente com a palavra Super para possível polimorfismo
	public SavingsAccount() {
		super();
	}

	//Criando os contrutores com argumentos incluindo o objeto criado na própria classe
	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	//Criando os getters and setters
	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	//Created method for return the balance after the interest rate calculated
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	//Método herdado da superclasse Account
	@Override
	public void withdraw(double amount) {
		balance -= amount;
	}
}
