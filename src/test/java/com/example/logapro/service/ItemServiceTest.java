package com.example.logapro.service;

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

    @Test
    void appenderChangeTest() {
        itemService.changeAppender();
    }
}