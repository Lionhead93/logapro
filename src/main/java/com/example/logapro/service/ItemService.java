package com.example.logapro.service;

import ch.qos.logback.classic.Logger;
import com.example.logapro.model.Item;
import com.example.logapro.model.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.ILoggerFactory;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item saveNewItem(String name, Long price, Long count) {

        Item item = new Item();
        item.setCount(count);
        item.setName(name);
        item.setPrice(price);

        return itemRepository.save(item);
    }

    public Item getItem(Long id){
        return itemRepository.findById(id).orElse(new Item());
    }

    public void changeAppender() {
        log.info("before appender change....");

        ILoggerFactory iLoggerFactory = LoggerFactory.getILoggerFactory();

        Logger logger = (Logger) iLoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
        logger.detachAppender("DEFAULT");

        logger.addAppender(logger.getAppender("BATCH"));

        log.info("after appender change....");
    }

}
