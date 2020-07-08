package com.monev.online.shop.service;

import com.monev.online.shop.model.Item;
import org.springframework.stereotype.Service;

@Service
public interface ItemService {
    void createItem (Item item);
    void updateItem (Item item);
    void createOrUpdateItem (Item item);
}
