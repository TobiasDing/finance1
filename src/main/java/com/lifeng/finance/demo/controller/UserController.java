package com.lifeng.finance.demo.controller;

import com.lifeng.finance.demo.models.Customer;
import com.lifeng.finance.demo.models.Item;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {


    @RequestMapping("/")
    public Customer index() {
        return new Customer("lifeng");
    }

    @RequestMapping("/hello")
    public String getName() {
        return "Hello";
    }
}
