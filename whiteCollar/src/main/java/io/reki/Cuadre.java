package io.reki;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cuadre {
	@Id
	private String name;
	private int price;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	private String autor;
	private Date entryDate;
	
	public Cuadre(String name, int price , String autor, Date entryDate) {
		super();
		this.name = name;
		this.autor = autor;
		this.price = price;
		this.entryDate = entryDate;
	}

}
