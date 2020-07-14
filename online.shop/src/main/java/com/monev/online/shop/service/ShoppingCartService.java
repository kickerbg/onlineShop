package com.monev.online.shop.service;

import com.monev.online.shop.model.ShoppingCart;
import org.springframework.stereotype.Service;

@Service
public interface ShoppingCartService {
    void createShoppingCart(ShoppingCart shoppingCart);
    void updateShoppingCart(ShoppingCart shoppingCart);
    void createOrUpdateShoppingCart(ShoppingCart shoppingCart);
}
