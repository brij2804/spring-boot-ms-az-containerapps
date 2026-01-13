package com.brijesh.ms.az.customerservices.controller;

import com.brijesh.ms.az.customerservices.model.Customer;
import com.brijesh.ms.az.customerservices.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    private CustomerServices customerServices;

    public CustomerController(@Autowired CustomerServices customerServices){
        this.customerServices= customerServices;
    }

    @GetMapping("/customer/{id}")
    public Customer getCustomerDetailsById(@PathVariable String id){
        return customerServices.getCustomerDetailsById();
    }
}
