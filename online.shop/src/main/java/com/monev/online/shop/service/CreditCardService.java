package com.monev.online.shop.service;

import com.monev.online.shop.model.CreditCard;
import org.springframework.stereotype.Service;

@Service
public interface CreditCardService {
    void createCreditCard(CreditCard creditCard);
    void updateCreditCard(CreditCard creditCard);
    void createOrUpdateCreditCard(CreditCard creditCard);
}
