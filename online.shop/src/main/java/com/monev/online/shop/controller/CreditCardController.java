package com.monev.online.shop.controller;

import com.monev.online.shop.model.CreditCard;
import com.monev.online.shop.service.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("creditCard")
public class CreditCardController {
    private final CreditCardService creditCardService;

    @Autowired
    public CreditCardController(CreditCardService creditCardService) {
        this.creditCardService = creditCardService;
    }

    @PostMapping
    public void createOrUpdateCreditCard(@RequestBody CreditCard creditCard) {
        creditCardService.createOrUpdateCreditCard(creditCard);
    }

}
