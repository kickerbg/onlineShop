package com.monev.online.shop.service;

import com.monev.online.shop.model.Address;
import com.monev.online.shop.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AddressServiceImpl implements AddressService {
    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public void createAddress(Address address) {
        addressRepository.save(address);
    }

    @Override
    public void updateAddress(Address address) {
        addressRepository.save(address);

    }

    @Override
    public void createOrUpdateAddress(Address address) {
        if (null == address.getId()) {
            createAddress(address);
        } else {
            updateAddress(address);
        }

    }
}
