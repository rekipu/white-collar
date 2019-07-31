package io.reki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CuadreService {
	
	@Autowired
	private CuadreRepository cuadreRepository;
	
	public List<Cuadre> getAllCuadres(){
		List<Cuadre> cuadres = new ArrayList<>();
		cuadreRepository.findAll().forEach(cuadres::add);
		return cuadres;
	}
	
	public Optional<Cuadre> getCuadre(String id) {
		return cuadreRepository.findById(id);
	}

	public void addCuadre(Cuadre cuadre) {
		cuadreRepository.save(cuadre);
		
	}

	public void updateCuadre(String id, Cuadre topic) {
		cuadreRepository.save(topic);
		
	}

	public void deleteCuadre(String id) {
		cuadreRepository.deleteById(id);
	}

}
