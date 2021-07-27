package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.Customer;
import com.example.demo.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	CustomerService customerService;

	@GetMapping(path = "list")
	public ModelAndView send(ModelAndView mav) {
		mav.setViewName("list");
		List<Customer> customers = customerService.findAll();
		mav.addObject("customers", customers);

		return mav;
	}
}
