package com.example.cakebaker.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cakebaker.Repository.AddressRepository;
import com.example.cakebaker.Repository.CakeReposirory;
import com.example.cakebaker.Repository.ProductRepository;
import com.example.cakebaker.Repository.ShopRepository;
import com.example.cakebaker.entity.Address;
import com.example.cakebaker.entity.CakeCategory;
import com.example.cakebaker.entity.Product;
import com.example.cakebaker.entity.Shop;
import com.fasterxml.jackson.annotation.JsonIgnore;

@RestController
public class HomeController {
	
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ShopRepository shopRepository;
	@Autowired
	private AddressRepository addressRepository;

	@Autowired
	private CakeReposirory cakeRepository;
	
	@GetMapping("/")
	public String Home(){
		return "Connected";
	}
	
	@GetMapping("/getProduct")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	@GetMapping("/getShop")
	public List<Shop> getshopList(){
		return shopRepository.findAll();
	}
	
	@GetMapping("/getShopFromAddress")
	public List<Address> getShopsFromAddress(){
		return addressRepository.findAll();
	}
	
	@GetMapping("/getCategory")
	public List<CakeCategory> getCakesCategory(){
		return cakeRepository.findAll();
	}
}
