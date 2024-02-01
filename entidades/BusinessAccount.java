package entidades;
//associando a classe BusinessAccount na classe Account por meio da herança
public class BusinessAccount extends Account {
	
//criando o objeto de limite de empréstimo na classe BusinessAccount
	private Double loanLimit;
	
	//Criando o construtor sem argumentos somente com a palavra Super para possível polimorfismo
	public BusinessAccount() {
		super();
	}

	//Criando o construtor com argumentos incluindo o objeto criando na classe
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	//Criando os getters and setters
	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	//criando o método para calcular o empréstimo descontando a taxa de 10,00
	public void loan(double amount) {
		if (amount <= loanLimit) {
			balance += amount - 10.0;
		}
	}
	
	//Buscando o método já criado na superclasse Account, e incluindo o desconto de 2,00 da subclasse BusinessAccount
	@Override
	public void withdraw(double amount) {
		super.withdraw(amount);
		balance -= 2.0;
	}
}