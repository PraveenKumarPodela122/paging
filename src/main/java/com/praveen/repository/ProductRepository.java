package com.praveen.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.praveen.entity.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {

}
