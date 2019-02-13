package net.tarjeta.model;

import java.util.Calendar;
import java.util.Date;

public class Pere extends Tarjeta{
	
	public Pere(String marca,Integer numero,String cardholder, Date fechaVencimiento) {
		super(marca, numero, cardholder, fechaVencimiento);
	}
	
	public Double calcularTasa(Date fechaOperacion) {	
		 Calendar fecha = Calendar.getInstance();
		 fecha.setTime(fechaOperacion);
	     int mes = fecha.get(Calendar.MONTH) + 1;
	     return mes*0.1;
	}
}
