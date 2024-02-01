package aplicacao;

import java.text.ParseException;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidades.ImportedProduct;
import entidades.Product1;
import entidades.UsedProduct;

public class Aplication {

	public static void main(String[] args) throws ParseException {
		
	   
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		List<Product1> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data: ");
			System.out.print("Common, imported or used(c, i, u): ");
			char x = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(x == 'c') {
				
				list.add(new Product1(name, price));
			}
			else if(x == 'u') {
				System.out.print("Manufacturing date(DD/MM/YYYY): ");
				LocalDate ManufacturingDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, ManufacturingDate));
				}
			else if(x == 'i') {
				System.out.print("Customs free: ");
				double CustomsFree = sc.nextDouble();
				list.add(new ImportedProduct(name, price, CustomsFree));
			}
			else {
				System.out.println("informação inválida, comece novamente!!");
			}
		}
		System.out.println();
		System.out.println("Price Tags: ");
		
		for(Product1 prt: list) {
			System.out.println( prt.TagPrice());
		}	
		sc.close();
	}

}
