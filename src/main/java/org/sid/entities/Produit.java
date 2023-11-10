package org.sid.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.UUID)
	private String id;//UUID
	/**
	 * @param name
	 * @param price
	 * @param promotion
	 */
	public Produit(String name, int price, boolean promotion) {
		super();
		this.name = name;
		this.price = price;
		this.promotion = promotion;
	}
	/**
	 * 
	 */
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int price;
	@Column(nullable = false)
	private boolean promotion;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the promotion
	 */
	public boolean isPromotion() {
		return promotion;
	}
	/**
	 * @param promotion the promotion to set
	 */
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}
}
