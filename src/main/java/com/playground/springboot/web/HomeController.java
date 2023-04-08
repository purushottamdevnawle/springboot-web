package com.playground.springboot.web;

import com.playground.springboot.config.ApplicationConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private ApplicationConfiguration applicationConfiguration;

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String getHome() {
        return "Hello from " + applicationConfiguration.getName() + " - " + applicationConfiguration.getVersion();
    }
}
