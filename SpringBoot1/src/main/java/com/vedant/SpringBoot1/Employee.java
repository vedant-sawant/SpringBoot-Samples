package com.vedant.SpringBoot1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

//    @Autowired //Field Injection
    Payout payee;


    /* Contructor Injection
    public Employee(Payout payee)
    {
        this.payee=payee;
    }
    */

    // Setter Injection
    @Autowired
    void setPayee(Payout payee)
    {
        this.payee=payee;
    }


    void show()
    {
        payee.calculate();
        System.out.println("Employees are showing... ");
    }
}
