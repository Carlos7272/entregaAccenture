package net.tarjeta.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Tarjeta {

	protected String marca;
	protected Integer numero;
	protected String cardholder;	
	protected Date fechaVencimiento;
	static final Double limiteConsumo = 1000.0;	

	public Tarjeta(String marca,Integer numero,String cardholder, Date fechaVencimiento) {
		super();
		this.marca = marca;
		this.numero = numero;
		this.cardholder = cardholder;
		this.fechaVencimiento = fechaVencimiento;
	}
	
	public boolean equals(Object otraTarjeta) {
		if (otraTarjeta == null) return false;
		if (otraTarjeta instanceof Tarjeta) return this.numero == ((Tarjeta) otraTarjeta).getNumero();
		return false;
	}
	
	public boolean esValidaParaOperar() {		
		return this.fechaVencimiento.compareTo(new Date()) > 0 ;		
	}
	
	public abstract Double calcularTasa(Date fecha);
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getCardholder() {
		return cardholder;
	}
	public void setCardholder(String cardholder) {
		this.cardholder = cardholder;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public Double getLimiteConsumo() {
		return limiteConsumo;
	}
	
	@Override
    public String toString() {
		SimpleDateFormat d = new SimpleDateFormat("dd-MM-yy");		
        return "marca: " + marca + ", numero: " + numero + ", titular: " + cardholder + ", fecha de vencimiento: " + d.format(fechaVencimiento);
    }
	  
}
