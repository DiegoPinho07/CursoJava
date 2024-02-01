package entidades;

public class Account {
//criando os objetos da classe account
	private Integer number;
	private String holder;
	//criando um objeto protegido para que não possa ser alterado por outra classe
	protected Double balance;
		//criando os construtores, primeiro sem argumentos
	public Account() {
	}
	//criando os construtores com argumentos
	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}
//criando os getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
//criando os métodos para retornar o valor do saldo
	public Double getBalance() {
		return balance;
	}
//criando os métodos para a aplicação do saque na classe principal
	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}
//criando o métodos para aplicação do depósito na classe principal
	public void deposit(double amount) {
		balance += amount;
	}
}
