package com.liana.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@Value
public class PrimeController {
    @GetMapping("/new-prime")
    public String getPrimeNumber() {
        BigInteger primeNumber = new BigInteger(10000, 100, new java.util.Random());

        return primeNumber.toString();
    }
}
