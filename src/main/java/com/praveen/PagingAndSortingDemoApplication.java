package com.praveen;

import java.util.List;
import java.util.Scanner;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.praveen.entity.Product;
import com.praveen.service.ProductService;

@SpringBootApplication
public class PagingAndSortingDemoApplication implements CommandLineRunner{

	private static final Log logger=LogFactory.getLog(PagingAndSortingDemoApplication.class);
	@Autowired
	private ProductService productService ;
	
	public static void main(String[] args) {
		SpringApplication.run(PagingAndSortingDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


		
		System.out.println("Enter the page number");
		
		Scanner sc = new Scanner(System.in);
		int pgNo =sc.nextInt();
		
		System.out.println("Enter the number of entities ");
		int no = sc.nextInt();

	List<Product> products=	productService.findAllByPagination(pgNo, no);
	logger.info(" prodId\t prodName \t description");
	for(Product prod :products) {
		
		logger.info(prod.getProdId()+"\t"+prod.getProdName()+"\t"+prod.getDescription());
	}
		
	}

}
