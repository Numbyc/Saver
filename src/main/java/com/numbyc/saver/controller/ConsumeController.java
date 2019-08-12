package com.numbyc.saver.controller;

import com.numbyc.saver.model.Consume;
import com.numbyc.saver.service.ConsumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ConsumeController {

    @Autowired
    ConsumeService consumeService;


    @GetMapping("/get")
    public List<Consume> getAllConsumeRecord() {
        return consumeService.getList();
    }

    @PostMapping("/")
    public void addNewRecord(@RequestBody Consume consume) {

        consume.setConsumeId(UUID.randomUUID().toString());
        consumeService.addNew(consume);
    }

    @PostMapping("/{cid}")
    public void deleteRecord(@PathVariable String cid) {

    }
}
