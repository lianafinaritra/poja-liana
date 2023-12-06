package com.liana.poja.endpoint.rest.controller;

import lombok.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.util.Random;

@RestController
@Value
public class PrimeController {
    @GetMapping("/new-prime")
    public String getPrimeNumber() {
        BigInteger primeNumber = BigInteger.probablePrime(512, new Random(100));

        return primeNumber.toString();
    }
}
