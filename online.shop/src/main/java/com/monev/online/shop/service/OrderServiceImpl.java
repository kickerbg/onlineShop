package com.monev.online.shop.service;

import com.monev.online.shop.model.Order;
import com.monev.online.shop.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    @Override
    public void updateOrder(Order order) {
        orderRepository.save(order);

    }

    @Override
    public void createOrUpdateOrder(Order order) {
        if (null == order.getId()) {
            createOrder(order);
            return;
        } else {
            updateOrder(order);
        }
    }
}
