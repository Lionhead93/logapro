package com.example.logapro.controller;

import com.example.logapro.model.Item;
import com.example.logapro.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
public class TestController {

    private final ItemService itemService;

    @GetMapping("/item/{id}")
    public String getItem(@PathVariable(value = "id") Long id) {
        return itemService.getItem(id).getName();
    }

    @GetMapping("/hello")
    public String hello() throws InterruptedException {
        log.info("hello");
        Thread.sleep(5000);
        return "hello";
    }

    @GetMapping("/world")
    public String world() throws InterruptedException {
        log.info("world");
        Thread.sleep(3000);
        return "world";
    }

    @PostMapping("/body")
    public String body(@RequestBody Item item) throws InterruptedException {
        log.info(item.toString());
        Thread.sleep(3000);
        return "ok";
    }
}
