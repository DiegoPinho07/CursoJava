package entidades;

import java.util.Date;

public class HoraContratada {
	
	 private Date data;
	 private double ValorPorHora;
	 private Integer hora;
	 
	 public HoraContratada(){
		 
	 }
	public double getValorPorHora() {
		return ValorPorHora;
	}
	public void setValorPorHora(double valorPorHora) {
		ValorPorHora = valorPorHora;
	}
	public Integer getHora() {
		return hora;
	}
	public void setHora(Integer hora) {
		this.hora = hora;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public HoraContratada(double valorPorHora, Integer hora, Date data) {
		
		ValorPorHora = valorPorHora;
		this.hora = hora;
		this.data = data;
		
	}
	 
	public HoraContratada(Date dataContrato, double valorPorHora2, int horas) {
		
	}
	public double ValorTotal() {
		
		return ValorPorHora * hora;
	}
	public void add(HoraContratada contrato) {
		
	}
	public void remove(HoraContratada contrato) {
		
		
	}
	
		
	
	 
	

}
