package com.monev.online.shop.controller;

import com.monev.online.shop.model.Customer;
import com.monev.online.shop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {
    private final CustomerService customerService;

    @Autowired

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }
    @PostMapping
    public void createOrUpdate (@RequestBody Customer customer){
        customerService.createOrUpdateCustomer(customer);
    }
}
