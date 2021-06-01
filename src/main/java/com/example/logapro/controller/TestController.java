package com.example.logapro.controller;

import com.example.logapro.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final ItemService itemService;

    @GetMapping("/item/{id}")
    public String getItem(@PathVariable(value = "id") Long id) {
        return itemService.getItem(id).getName();
    }

}
