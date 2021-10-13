package com.example.hobbitron.controller;

import com.example.hobbitron.model.Hobbit;
import com.example.hobbitron.service.HobbitService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HobbitController {

    private final HobbitService service;

    public HobbitController(HobbitService service) {
        this.service = service;
    }

    @GetMapping("/hobbits")
    List<Hobbit> getAll() {
        return service.getAll();
    }

    @PostMapping("/hobbits")
    Hobbit save(@RequestBody Hobbit hobbit) {
        return service.save(hobbit);
    }
}
