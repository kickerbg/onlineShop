package com.monev.online.shop.service;

import com.monev.online.shop.model.Customer;
import com.monev.online.shop.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {
    void createCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void createOrUpdateCustomer(Customer customer);
}
