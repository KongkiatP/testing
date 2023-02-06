package com.king.mongkut.testing.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class CalculationServiceTest {

    @InjectMocks
    private CalculationService calculationService;

    @Test
    void should_return_number_when_call_minus_given_number1_and_number2() {
        // Given
        // When
        int actual = calculationService.minus("10", "5");

        // Then
        assertEquals(5, actual);
    }

    @Test
    void should_return_minus_one_when_call_minus_given_number1_is_X() {
        // Given
        // When
        int actual = calculationService.minus("X", "5");

        // Then
        assertEquals(-1, actual);
    }
}