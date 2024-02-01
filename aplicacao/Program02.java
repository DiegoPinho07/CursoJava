package aplicacao;

import entidades.Account;
import entidades.BusinessAccount;
import entidades.SavingsAccount;

public class Program02 {

	public static void main(String[] args) {

		//instanciando um objeto do tipo Account e atribuindo ele o método de uma subclasse 
		Account acc1 = new Account(1001, "Alex", 1000.0);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		
		//Fazendo um Downcasting da superclasse Account para a subclasse SavingsAccount
		Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
		
		//Fazendo um Downcasting da superclasse Account para a subclasse BusinessAccount
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		
		BusinessAccount acc4 = new BusinessAccount(1004, "Diego", 1000.0, 500.0);
		acc4.loan(300);
		System.out.println(acc4.getBalance());
		
		SavingsAccount acc5 = new SavingsAccount(1005, "Gabi", 1000.0, 0.01);
		acc5.updateBalance();
		System.out.println(acc5.getBalance());
	}
}