package com.praveen.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.praveen.entity.Product;
import com.praveen.repository.ProductRepository;

@Service(value="ProductService")
public class PageServiceImpl   implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllByPagination(Integer pgNo, Integer noOfEntitiesPerPage) throws Exception {
		
		Pageable pageable = PageRequest.of(pgNo, noOfEntitiesPerPage);
		
		  Page <Product> page =productRepository.findAll(pageable);
		  
	List<Product> products =null;
	
	
	if(page.hasContent()) {
		
		products=page.getContent();
		
	}
	if(products.isEmpty()) throw new Exception("no products found");
	
		return products;
	}

	
}
