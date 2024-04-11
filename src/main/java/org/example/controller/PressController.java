package org.example.controller;

import org.example.model.Press;
import org.example.service.IPressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/press")
public class PressController {

    private final IPressService pressService;

    @Autowired
    public PressController(IPressService pressService) {
        this.pressService = pressService;
    }

    @GetMapping
    public List<Press> getAllPressReleases() {
        return pressService.findAll();
    }

    @GetMapping("/{id}")
    public Press getPressReleaseById(@PathVariable int id) {
        return pressService.findById(id);
    }
}
