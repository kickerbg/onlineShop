package com.monev.online.shop.controller;

import com.monev.online.shop.model.Address;
import com.monev.online.shop.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("address")
public class AddressController {
    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }
@PostMapping
    public void createOrUpdate(@RequestBody Address address) {
        addressService.createOrUpdateAddress(address);
    }
}
