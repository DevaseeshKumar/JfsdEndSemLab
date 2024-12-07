package com.klef.jfsd.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.klef.jfsd.exam.model.Customer;
import com.klef.jfsd.exam.service.CustomerService;


@RestController
@RequestMapping("customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/")
	public String home() {
		return "JPA";
	}
	
	@GetMapping("/viewall")
	public List<Customer> viewallcustomers() {
	    return service.viewallcustomers();
	}


}
