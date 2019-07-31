package io.reki;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShopService {
	
	@Autowired
	private ShopRepository shopRepository;
	
	public List<Shop> getAllShops(){
		List<Shop> shops = new ArrayList<>();
		shopRepository.findAll().forEach(shops::add);
		return shops;
	}
	
	public Optional<Shop> getShop(String id) {
		return shopRepository.findById(id);
	}

	public void addShop(Shop shop) {
		shopRepository.save(shop);
		
	}

	public void updateShop(String id, Shop topic) {
		shopRepository.save(topic);
		
	}

	public void deleteShop(String id) {
		shopRepository.deleteById(id);
	}

}
