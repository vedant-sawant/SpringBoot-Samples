package com.vedant.SpringBoot1;

import org.springframework.stereotype.Component;

@Component
public class Payout {
    public void calculate()
    {
        System.out.println("Hello calculating payout of employee");
    }
}
