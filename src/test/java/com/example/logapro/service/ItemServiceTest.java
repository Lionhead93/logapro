package com.example.logapro.service;

import com.example.logapro.model.Item;
import com.example.logapro.model.ItemRepository;
import com.example.logapro.model.Manufacturer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("mysql")
@SpringBootTest
class ItemServiceTest {

    @Autowired
    ItemService itemService;
    @Autowired
    ItemRepository itemRepository;

    @Test
    void appenderChangeTest() {
        itemService.changeAppender();
    }

    @Test
    void saveItem() {

        Manufacturer manufacturer = new Manufacturer();
        manufacturer.setAddress("seong su");
        manufacturer.setName("hanpass");

        Item item = new Item();
        item.setPrice(1000L);
        item.setName("coffee");
        item.setCount(10L);
        item.setManufacturer(null);

        itemRepository.save(item);
    }

}