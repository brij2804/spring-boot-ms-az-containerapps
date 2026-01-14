package com.brijesh.ms.az.customerservices.controller;

import com.brijesh.ms.az.customerservices.model.Customer;
import com.brijesh.ms.az.customerservices.services.CustomerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/customer")
    public ResponseEntity getCustomerDetailsById(){
        ResponseEntity response = new ResponseEntity<>(customerServices.getCustomerDetailsById(), HttpStatus.OK);
        return response ;
    }
}
