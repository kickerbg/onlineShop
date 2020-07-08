package com.monev.online.shop.service;

import com.monev.online.shop.model.Customer;
import com.monev.online.shop.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;
    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void createOrUpdateCustomer(Customer customer) {
        if (null == customer.getId()){
            createCustomer(customer);
            return;
        } else {
            updateCustomer(customer);
        }
    }
}
