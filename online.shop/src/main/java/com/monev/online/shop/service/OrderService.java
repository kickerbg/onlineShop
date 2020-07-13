package com.monev.online.shop.service;

import com.monev.online.shop.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    void createOrder(Order order);
    void updateOrder(Order order);
    void createOrUpdateOrder(Order order);
}
