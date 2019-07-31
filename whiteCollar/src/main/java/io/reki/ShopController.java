package io.reki;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping("/shops")
	public List<Shop> getAllShops() {
		return shopService.getAllShops();
	}
	
	@RequestMapping("/shops/{id}")
	public Optional<Shop> getTopic(@PathVariable String id) {
		return shopService.getShop(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/shops")
	public void addTopic(@RequestBody Shop shop) {
		shopService.addShop(shop);
	}
	

}
