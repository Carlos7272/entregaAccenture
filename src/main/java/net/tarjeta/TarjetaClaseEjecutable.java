package net.tarjeta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import net.tarjeta.model.Operacion;
import net.tarjeta.model.Pere;
import net.tarjeta.model.Squa;
import net.tarjeta.model.Tarjeta;

public class TarjetaClaseEjecutable {
	
	  public static void main(String[] args) {
		  
		  List<Tarjeta> misTarjetas = new ArrayList<Tarjeta>();
		  
		  //creo una fecha de vencimiento
		  Date fechaVencimiento = null;
		  SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	      String dateInString = "7-Jun-2019";
          try {
	            fechaVencimiento = formatter.parse(dateInString);	          
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		  
		  Tarjeta tarjeta1 = new Squa("Visa", 232211, "Emilio Gomez", fechaVencimiento);
		  misTarjetas.add(tarjeta1);
		  
		  Tarjeta tarjeta2 = new Pere("Master", 345566, "Lucas Gorr", fechaVencimiento);
		  misTarjetas.add(tarjeta2);
		  
          Operacion operacion = new Operacion(1111L,"Pago", 100.1, new Date(), tarjeta1);
          //se informa si la operacion es valida para operar para la tarjeta 
		  System.out.println("La operacion es " + (operacion.esValida(tarjeta1.getLimiteConsumo())?"valida":"invalida"));
		  
		  for(Tarjeta unaTarjeta: misTarjetas) {
			  
			  //se muestran los datos de la tarjeta
			  System.out.println(unaTarjeta.toString());
			  
			  //se muestra si la tarjeta es valida para operar
			  System.out.println("La tarjeta: " + unaTarjeta.getNumero() + (unaTarjeta.esValidaParaOperar()?" es valida":" no es valida") + " para operar");
		  
		  }
		  //determino si dos tarjetas son iguales:
		  System.out.println("La tarjeta: " + tarjeta1.getNumero() + " es " + (tarjeta1.equals(tarjeta2)?"identica ":"diferente ") + " a la tarjeta: " + tarjeta2.getNumero());		  
		 
		  //determino la tasa de una operacion
		  System.out.println("La operacion: " + operacion.getTipo() + " tiene la siguiente tasa: " + operacion.obtenerTasa());
	      }

}

