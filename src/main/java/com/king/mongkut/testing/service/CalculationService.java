package com.king.mongkut.testing.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

    public int plus(String number1, String number2) {
        return Integer.parseInt(number1) + Integer.parseInt(number2);
    }

    public int minus(String number1, String number2) {
        try {
            return Integer.parseInt(number1) - Integer.parseInt(number2);
        } catch (NumberFormatException exception) {
            return -1;
        }
    }
}
