package com.example.cakebaker.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name="CakeCategory")
public class CakeCategory {
	

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long cake_Id;
	private String category_name;
	private String category_featured_image;
	
	@JsonIgnoreProperties(value={"cakeCategory"})
	@OneToMany(mappedBy="cakeCategory",cascade=CascadeType.ALL)
	private List<Product> product;
	
	
	public Long getCake_Id() {
		return cake_Id;
	}

	public void setCake_Id(Long cake_Id) {
		this.cake_Id = cake_Id;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_featured_image() {
		return category_featured_image;
	}

	public void setCategory_featured_image(String category_featured_image) {
		this.category_featured_image = category_featured_image;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}

}
