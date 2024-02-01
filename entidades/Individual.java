package entidades;

public class Individual extends TaxPayer {
	
	private Double helthExpenditures;
	
public Individual() {
		
	}

	public Individual(String name, Double anualIncome, Double helthExpenditures) {
		super(name, anualIncome);
		this.helthExpenditures = helthExpenditures;
	}
	

	public Double getHelthExpenditures() {
		return helthExpenditures;
	}

	public void setHelthExpenditures(Double helthExpenditures) {
		this.helthExpenditures = helthExpenditures;
	}

	@Override
	public Double Tax() {
		 
		if(getAnualIncome() < 2000) {
			
			return  getAnualIncome() * 0.15 - getHelthExpenditures() * 0.5;
		}
		
		else {
			
			return getAnualIncome() * 0.25 - getHelthExpenditures() * 0.5;
		}
	}
	
	

}

