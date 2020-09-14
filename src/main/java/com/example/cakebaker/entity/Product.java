package com.example.cakebaker.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Products")
public class Product {
	
	public CakeCategory getCakeCategory() {
		return cakeCategory;
	}
	public void setCakeCategory(CakeCategory cakeCategory) {
		this.cakeCategory = cakeCategory;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long product_id;
	private Long cake_id;
	private String product_name;
	private String product_weight;
	private String product_featured_image;
	private String product_topview;
	private boolean eggless;
	
	@JsonIgnore
	@ManyToOne
	@JoinColumn(name="shopId",nullable=false)
	private Shop shop;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name="category_id",nullable=false)
	private CakeCategory cakeCategory;
	
	public Shop getShop() {
		return shop;
	}
	public void setShop(Shop shop) {
		this.shop = shop;
	}
	public Long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(Long product_id) {
		this.product_id = product_id;
	}
	
	public Long getCake_id() {
		return cake_id;
	}
	public void setCake_id(Long cake_id) {
		this.cake_id = cake_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_weight() {
		return product_weight;
	}
	public void setProduct_weight(String product_weight) {
		this.product_weight = product_weight;
	}
	public String getProduct_featured_image() {
		return product_featured_image;
	}
	public void setProduct_featured_image(String product_featured_image) {
		this.product_featured_image = product_featured_image;
	}
	public String getProduct_topview() {
		return product_topview;
	}
	public void setProduct_topview(String product_topview) {
		this.product_topview = product_topview;
	}
	public boolean isEggless() {
		return eggless;
	}
	public void setEggless(boolean eggless) {
		this.eggless = eggless;
	}
	
	
	
	
	

}
