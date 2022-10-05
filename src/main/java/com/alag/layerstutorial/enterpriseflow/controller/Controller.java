package com.alag.layerstutorial.enterpriseflow.controller;

import com.alag.layerstutorial.enterpriseflow.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending response in the right format
@RestController
public class Controller {

    @Autowired
    private BusinessService businessService;

    @GetMapping("/sum")
    public long displaySum() {
        return businessService.calculateSum();
    }
}
