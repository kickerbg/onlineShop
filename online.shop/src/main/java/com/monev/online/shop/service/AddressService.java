package com.monev.online.shop.service;

import com.monev.online.shop.model.Address;

public interface AddressService {
    void createAddress (Address address);
    void updateAddress (Address address);
    void createOrUpdateAddress (Address address);

}
