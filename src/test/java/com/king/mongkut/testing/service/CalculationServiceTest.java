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
    void should_return_success_when_call_plus_with_number1_and_number2(){
        int result = calculationService.plus("2","3");
        assertEquals(5,result);
    }

    @Test
    void should_return_error_when_call_plus_with_number1_and_number2(){
        assertThrows(NumberFormatException.class,()-> {calculationService.plus("b","3");});
    }
}