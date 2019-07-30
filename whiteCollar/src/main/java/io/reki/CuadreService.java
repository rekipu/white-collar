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
	
	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring", "Spring Framework", "spring framework description"),
			new Topic("java", "core java", "core java description"),
			new Topic("javascript", "Javascript", "javascript description")	
			));
	*/
	public List<Cuadre> getAllCuadres(){
		// return topics;
		List<Cuadre> cuadres = new ArrayList<>();
		cuadreRepository.findAll().forEach(cuadres::add);
		return cuadres;
	}
	
	public Optional<Cuadre> getCuadre(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return cuadreRepository.findById(id);
	}

	public void addCuadre(Cuadre cuadre) {
		//topics.add(topic);
		cuadreRepository.save(cuadre);
		
	}

	public void updateCuadre(String id, Cuadre topic) {
		/*for(int i = 0; i< topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		cuadreRepository.save(topic);
		
	}

	public void deleteCuadre(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		cuadreRepository.deleteById(id);
	}

}
