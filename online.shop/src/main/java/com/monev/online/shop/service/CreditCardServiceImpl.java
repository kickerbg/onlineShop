package com.monev.online.shop.service;

import com.monev.online.shop.model.CreditCard;
import com.monev.online.shop.repository.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreditCardServiceImpl implements  CreditCardService{
    private final CreditCardRepository creditCardRepository;

    @Autowired
    public CreditCardServiceImpl(CreditCardRepository creditCardRepository) {
        this.creditCardRepository = creditCardRepository;
    }

    @Override
    public void createCreditCard(CreditCard creditCard) {
        creditCardRepository.save(creditCard);

    }

    @Override
    public void updateCreditCard(CreditCard creditCard) {
        creditCardRepository.save(creditCard);

    }

    @Override
    public void createOrUpdateCreditCard(CreditCard creditCard) {
        if (null == creditCard.getId()){
            createCreditCard(creditCard);
            return;
        }else{
            updateCreditCard(creditCard);
        }

    }
}
