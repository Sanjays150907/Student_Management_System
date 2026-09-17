package com.example.Student_management_system.controller;

import org.springframework.web.bind.annotation.*;

import com.example.Student_management_system.services.getinfo;
import com.example.Student_management_system.model.info;

@RestController
@RequestMapping("/info")
public class infocontroller {
    private final getinfo info;
    public infocontroller(getinfo info) {
        this.info = info;
    }

    @GetMapping
    public info getInfo() {
        return info.getInfo();
    }
    @PostMapping
    public info addInfo(@RequestBody info info) {
        return info;
    }
}