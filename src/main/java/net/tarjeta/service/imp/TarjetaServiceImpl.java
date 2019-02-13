package net.tarjeta.service.imp;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Service;

import net.tarjeta.model.Informe;
import net.tarjeta.model.Operacion;
import net.tarjeta.model.Pere;
import net.tarjeta.model.Tarjeta;
import net.tarjeta.service.TarjetaService;
@Service
public class TarjetaServiceImpl implements TarjetaService{
	@Override
	public Informe getInforme(String idInforme) {
		
		//apartir de aca buscaria con algun elemento de persistencia la operacion con el id
	    //para luego calcular lo solicitado en el informe.
		//creo una dato ficticcio que viene de db
		//creo una fecha de vencimiento
		Date fechaVencimiento = null;
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
	    String dateInString = "7-Jun-2019";
        try {
        	fechaVencimiento = formatter.parse(dateInString);	          
	    } catch (ParseException e) {
	    	e.printStackTrace();
	    }
		Tarjeta tarjeta = new Pere("Master", 345566, "Lucas Gorr", fechaVencimiento);
		Operacion operacion = new Operacion(1111L,"Pago", 100.1, new Date(), tarjeta);		
		
		return new Informe(tarjeta.getMarca(), operacion.obtenerTasa());
		}

}
