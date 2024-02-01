package entidades;

public class ImportedProduct  extends Product1 {
	
	private Double CustomsFree;

	public ImportedProduct(String name, Double price, Double customsFree) {
		super(name, price);
		CustomsFree = customsFree;
	}

	public Double getCustomsFree() {
		return CustomsFree;
	}

	public void setCustomsFree(Double customsFree) {
		CustomsFree = customsFree;
	}
	
	public Double TotalPrice() {
		return getPrice() + CustomsFree;
	}
	
	
	public String TagPrice() {
		return getName() + " $ " + String.format("%.2f", TotalPrice()) + "(customs Free: " + String.format("%.2f", CustomsFree) + ")";
}
}