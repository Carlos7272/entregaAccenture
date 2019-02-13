package net.tarjeta.model;

import java.util.Calendar;
import java.util.Date;

public class Squa extends Tarjeta{
	
	public Squa(String marca,Integer numero,String cardholder, Date fechaVencimiento) {
		super(marca, numero, cardholder, fechaVencimiento);
	}
	
	public Double calcularTasa(Date fechaOperacion) {
		Calendar fecha = Calendar.getInstance();		
		fecha.setTime(fechaOperacion);
        int anio = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH) + 1;		
		return (double) (anio/mes);
	}

}
