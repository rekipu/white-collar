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
	
	@RequestMapping("/topics")
	public List<Cuadre> getAllCuadres() {
		return cuadreService.getAllCuadres();
	}
	
	@RequestMapping("/topics/{id}")
	public Optional<Cuadre> getTopic(@PathVariable String id) {
		return cuadreService.getCuadre(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Cuadre cuadre) {
		cuadreService.addCuadre(cuadre);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Cuadre cuadre,@PathVariable String id) {
		cuadreService.updateCuadre(id, cuadre);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteCuadre(@PathVariable String id) {
		cuadreService.deleteCuadre(id);
	}
}
