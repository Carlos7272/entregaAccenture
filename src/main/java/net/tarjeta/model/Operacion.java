package net.tarjeta.model;

import java.util.Date;

public class Operacion {
	
	Long idOperacion;
	String tipo;
	Double montoOperado;
	Date fecha;
	Tarjeta tarjeta;
	
	public Operacion(Long idOperacion, String tipo, Double monto, Date fecha, Tarjeta tarjeta) {
		super(); 
		this.idOperacion = idOperacion;
		this.tipo = tipo;
		this.montoOperado = monto;
		this.fecha = fecha;
		this.tarjeta = tarjeta;
	}
	
	public boolean esValida(Double unMonto) {
		return this.montoOperado > unMonto;
	}
	
	public Double obtenerTasa() {		
		return this.tarjeta.calcularTasa(this.fecha) ;
	}
	
	
	public Long getIdOperacion() {
		return idOperacion;
	}
	public void setIdOperacion(Long idOperacion) {
		this.idOperacion = idOperacion;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Double getMontoOperado() {
		return montoOperado;
	}
	public void setMontoOperado(Double montoOperado) {
		this.montoOperado = montoOperado;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Tarjeta getTarjeta() {
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
}
