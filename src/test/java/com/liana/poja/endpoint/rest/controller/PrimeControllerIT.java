package com.liana.poja.endpoint.rest.controller;

import com.liana.poja.conf.FacadeIT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigInteger;

public class PrimeControllerIT extends FacadeIT {

    @Autowired PrimeController primeController;

    @Test
    void isPrime() {
        String primeNumberString = primeController.getPrimeNumber();
        BigInteger primeNumber = new BigInteger(primeNumberString);

        Assertions.assertTrue(primeNumber.isProbablePrime(100));
    }

    @Test
    void hasCorrectLength() {
        String primeNumberString = primeController.getPrimeNumber();
        BigInteger primeNumber = new BigInteger(primeNumberString);

        Assertions.assertEquals(512, primeNumber.bitLength());
    }
}
