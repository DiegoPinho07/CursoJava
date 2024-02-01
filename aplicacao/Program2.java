package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.Company;
import entidades.Individual;
import entidades.TaxPayer;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				
				System.out.print("Health expenditures: ");
				double helthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, helthExpenditures));
			}
			else {
				System.out.print("Number of employees: ");
			    int numberOfEmployee = sc.nextInt();
			    list.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID: ");
		for(TaxPayer tp : list) {
			
			System.out.println(tp.getName() + " $ " + String.format("%.2f", tp.Tax()));
		}
		double sum = 0.0;
		System.out.println();
		for(TaxPayer tp : list) {
			
			sum += tp.Tax();
			
		}
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
      sc.close(); 
	}

}
