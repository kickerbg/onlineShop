package com.monev.online.shop.service;

import com.monev.online.shop.model.ShoppingCart;
import com.monev.online.shop.repository.ShoppingCartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartServiceImpl implements  ShoppingCartService{
    private final ShoppingCartRepository shoppingCartRepository;
    @Autowired
    public ShoppingCartServiceImpl(ShoppingCartRepository shoppingCartRepository) {
        this.shoppingCartRepository = shoppingCartRepository;
    }

    @Override
    public void createShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);
    }

    @Override
    public void updateShoppingCart(ShoppingCart shoppingCart) {
        shoppingCartRepository.save(shoppingCart);

    }

    @Override
    public void createOrUpdateShoppingCart(ShoppingCart shoppingCart) {
        if(null == shoppingCart.getId()){
            createShoppingCart(shoppingCart);
            return;
        }else{
            updateShoppingCart(shoppingCart);
        }
    }
}
