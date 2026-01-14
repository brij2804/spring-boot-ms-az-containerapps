package com.brijesh.ms.az.customerservices.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Customer {
    public String firstName;
    public String lastName;
    public String mobile;
    public String email;
}
