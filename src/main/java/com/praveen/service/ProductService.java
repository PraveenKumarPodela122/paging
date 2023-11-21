package com.praveen.service;

import java.util.List;

import com.praveen.entity.Product;

public interface ProductService {
	
	public List<Product> findAllByPagination(Integer pgNo ,Integer noOfEntitiesPerPage ) throws Exception;

}
