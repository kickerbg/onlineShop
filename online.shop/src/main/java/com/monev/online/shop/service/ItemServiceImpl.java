package com.monev.online.shop.service;

import com.monev.online.shop.model.Item;
import com.monev.online.shop.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemServiceImpl implements ItemService {
    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public void createItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    public void updateItem(Item item) {
        itemRepository.save(item);

    }

    @Override
    public void createOrUpdateItem(Item item) {
        if (null == item.getId()) {
            createItem(item);
            return;
        } else {
            updateItem(item);
        }

    }
}
