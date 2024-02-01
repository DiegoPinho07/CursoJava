package entidades;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entidades.enums.NivelTrabalhador;

public class Trabalhador {
	//criando as variáveis da classe trabalhador
	private String nome;
	private NivelTrabalhador nivel;
	private Double BaseSalarial;
	//instanciando os objetos associados à classe
	private Departamento departamento;
	private List<HoraContratada> contratos = new ArrayList<>();
	
	public Trabalhador() {
		
	}

	public Trabalhador(String nome, NivelTrabalhador nivel, Double baseSalarial, Departamento departamento) {
		
		this.nome = nome;
		this.nivel = nivel;
		BaseSalarial = baseSalarial;
		this.departamento = departamento;
		
	}

	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public NivelTrabalhador getNivel() {
		return nivel;
	}

	public void setNivel(NivelTrabalhador nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalarial() {
		return BaseSalarial;
	}

	public void setBaseSalarial(Double baseSalarial) {
		BaseSalarial = baseSalarial;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<HoraContratada> getContratos() {
		return contratos;
	}
	//adicionando contrato por meio do argumento addcontrato(não permitir o setcontrato)
public void addcontrato(HoraContratada contrato) {
	contrato.add(contrato);
}
	public void removeContrato(HoraContratada contrato) {
		contrato.remove(contrato);
	
	
}
	
public double income(int year, int month) {
	
	double Soma = BaseSalarial;
	Calendar cal = Calendar.getInstance();
	//percorrendo a lista de contratos
	for(HoraContratada c: contratos) {
		
		cal.setTime(c.getData());
		//retirando somente o ano da data
		int c_year = cal.get(Calendar.YEAR);
		//retirando somente o mes da data
		int c_month = 1 + cal.get(Calendar.MONTH);
	
	
	
	
	
	if(year == c_year && month == c_month) {
		
		Soma += c.ValorTotal();
	}

}

     return Soma;
}
}
