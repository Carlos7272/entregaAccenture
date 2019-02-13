package net.tarjeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import net.tarjeta.model.Informe;
import net.tarjeta.service.TarjetaService;

@RestController
public class TarjetaController {
	
	TarjetaService tarjetaService;
	
	@Autowired
	public TarjetaController(TarjetaService tarjetaService) {
		this.tarjetaService = tarjetaService;
	}

	@RequestMapping(value="/consultaTasa/operacion/{operacion}", method = RequestMethod.GET)
	@ResponseBody
	public Informe getConsultaTasa(@PathVariable String operacion) {		
		
		return tarjetaService.getInforme(operacion);  
	}
}


