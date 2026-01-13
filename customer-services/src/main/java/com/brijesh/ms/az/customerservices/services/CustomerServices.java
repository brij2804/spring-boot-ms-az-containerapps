package com.brijesh.ms.az.customerservices.services;

import com.brijesh.ms.az.customerservices.model.Customer;
import org.springframework.stereotype.Service;

@Service
public class CustomerServices {

    public Customer getCustomerDetailsById(){
        Customer cust = new Customer();
        cust.setFirstName("Tom");
        cust.setLastName("Brady");
        cust.setMobile("123456789");
        cust.setEmail("funnyemail@abc.com");
        return cust;
    }
}
