package net.tarjeta.model;

public class Informe {
	
	String marca;
	Double importe;
	
	public Informe(String marca, Double importe) {
		this.marca = marca;
		this.importe = importe;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getImporte() {
		return importe;
	}
	public void setImporte(Double importe) {
		this.importe = importe;
	}

}
