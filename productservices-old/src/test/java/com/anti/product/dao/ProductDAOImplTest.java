package com.anti.product.dao;

import static org.junit.Assert.*;

import org.junit.Test;

import com.anti.product.dto.Product;



public class ProductDAOImplTest {

	
	// Product DAO tszteli ugyn az package !!!
	//com.anti.product.dao
	@Test
	public void createShouldCreateAProduct() {
		ProductDAOImpl dao = new ProductDAOImpl();
		
		Product product = new Product();
		product.setId(1);
		product.setName("PS4");
		product.setDescription("Best console ever!");
		product.setPrice(1000);
		
		dao.create(product);
		
		Product result = dao.read(1);
		
		assertNotNull(result);
		assertEquals("PS4", result.getName());
		
	}
    // extract select new Product ctrl +1 cretae pleadany
}
