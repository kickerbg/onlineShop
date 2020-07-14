package com.monev.online.shop.controller;

import com.monev.online.shop.model.ShoppingCart;
import com.monev.online.shop.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("shoppingCart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }
    @PostMapping
    public void createOrUpdateShoppingCart(@RequestBody ShoppingCart shoppingCart){
        shoppingCartService.createOrUpdateShoppingCart(shoppingCart);
    }


}
