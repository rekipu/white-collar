package io.reki;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Shop {
	@Id
	private String name;
	private int maxCapacity;
	ArrayList<Cuadre> quadres = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMaxCapacity() {
		return maxCapacity;
	}
	public void setMaxCapacity(int maxCapacity) {
		this.maxCapacity = maxCapacity;
	}
	public ArrayList<Cuadre> getQuadres() {
		return quadres;
	}
	public void setQuadres(ArrayList<Cuadre> quadres) {
		this.quadres = quadres;
	}
	

}
