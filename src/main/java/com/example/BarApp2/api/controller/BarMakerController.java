package com.example.BarApp2.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.BarApp2.api.model.BarMaker;
import com.example.BarApp2.api.service.BarMakerService;

@RestController
@RequestMapping("/barmakers")
public class BarMakerController {

    @Autowired
    private BarMakerService barMakerService;

    @GetMapping
    public List<BarMaker> getAllBarMakers() {
        return barMakerService.getAllBarMakers();
    }

    @PostMapping
    public BarMaker createBarMaker(@RequestBody BarMaker barMaker) {
        return barMakerService.createBarMaker(barMaker);
    }

    @GetMapping("/{id}")
    public BarMaker getBarMakerById(@PathVariable int id) {
        return barMakerService.getBarMakerById(id);
    }

    @PutMapping("/{id}")
    public BarMaker updateBarMaker(@PathVariable int id, @RequestBody BarMaker barMakerDetails) {
        return barMakerService.updateBarMaker(id, barMakerDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteBarMaker(@PathVariable int id) {
        barMakerService.deleteBarMaker(id);
    }
}
