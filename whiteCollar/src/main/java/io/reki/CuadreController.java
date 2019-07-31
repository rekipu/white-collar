package io.reki;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CuadreController {
	
	@Autowired
	private CuadreService cuadreService;
	
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/shops/{id}/picture")
	public void updateTopic(@RequestBody Cuadre cuadre,@PathVariable String id) {
		cuadreService.updateCuadre(id, cuadre);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/shops/{id}/picture")
	public void deleteCuadre(@PathVariable String id) {
		cuadreService.deleteCuadre(id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/shops/{id}/pictures")
	public void deleteCuadres(@PathVariable String id) {
		
	}
}
