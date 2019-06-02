package com.netflix.prodServer.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.netflix.prodServer.entity.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@RequestMapping(value = "/prodlist",method = RequestMethod.GET)
	public List<Product> getProdList() {

		List<Product> arrayList = new ArrayList<Product>();
		for (int i = 0; i < 20; i++) {
			Product product = new Product();

			product.setProduceDate(new Date());
			product.setProductId(1001);
			product.setProductName("Intel Cell");

			arrayList.add(product);
		}

		return arrayList;

	}

}
