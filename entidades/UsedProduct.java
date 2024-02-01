package entidades;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Product1 {

	
	private LocalDate ManufacturingDate;

	public UsedProduct(String name, Double price, LocalDate manufacturingDate) {
		super(name, price);
		ManufacturingDate = manufacturingDate;
	}

	public LocalDate getManufacturingDate() {
		return ManufacturingDate;
	}

	public void setManufacturingDate(LocalDate manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}

     @Override
     public String TagPrice() {
    	return super.TagPrice() + " (Manufacturing Date: " + ManufacturingDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) + ")";
     }
}	