package com.example.cakebaker.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="Shop")
public class Shop {
	
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long shop_id;
	private String shop_name;
	private Long shop_number;
	private String shop_email;
	private Long sgop_gstn;
	
	@JsonManagedReference
	@OneToOne(targetEntity=Address.class,cascade=CascadeType.ALL)
	private Address address;
	
	@JsonIgnoreProperties(value={"shop"})
	@OneToMany(mappedBy="shop",cascade=CascadeType.ALL)
	private List<Product> product;
	
	
	
	public Long getShop_id() {
		return shop_id;
	}
	public void setShop_id(Long shop_id) {
		this.shop_id = shop_id;
	}
	
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public Long getShop_number() {
		return shop_number;
	}
	public void setShop_number(Long shop_number) {
		this.shop_number = shop_number;
	}
	public String getShop_email() {
		return shop_email;
	}
	public void setShop_email(String shop_email) {
		this.shop_email = shop_email;
	}
	
	public Long getSgop_gstn() {
		return sgop_gstn;
	}
	public void setSgop_gstn(Long sgop_gstn) {
		this.sgop_gstn = sgop_gstn;
	}
	
	public List<Product> getProduct() {
		return product;
	}
	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	

}
