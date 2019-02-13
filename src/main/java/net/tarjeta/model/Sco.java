package net.tarjeta.model;

import java.util.Calendar;
import java.util.Date;

public class Sco extends Tarjeta{
	
	public Sco(String marca,Integer numero,String cardholder, Date fechaVencimiento) {
		super(marca, numero, cardholder, fechaVencimiento);
	}
	
	public Double calcularTasa(Date fechaOperacion) {
		Calendar fecha = Calendar.getInstance();
		fecha.setTime(fechaOperacion);
		int dia = fecha.get(Calendar.DAY_OF_MONTH);        
		return dia*0.5;
	}

}
