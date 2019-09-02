package com.springboot.config.controller;


import com.springboot.config.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ConfigController {

    @Autowired
    private Config config;

    @GetMapping("/config")
    public String getConfig() {
        System.out.println(config.getName());
        return config.toString();
    }
}
