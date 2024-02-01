package entidades;

public class Product1 {

	private String name;
	private Double Price;
	
	
	public Product1(String name, Double price) {
		this.name = name;
		this.Price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		this.Price = price;
	}
	
	public String TagPrice() {
		return name + " $ " + String.format("%.2f", Price);
	}
	
}
