package com.king.mongkut.testing.controller;

import com.king.mongkut.testing.service.CalculationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class CalculationControllerTest {

    @Mock
    private CalculationService calculationService;

    @InjectMocks
    private CalculationController calculationController;


    @Test
    void should_return_success_when_call_plus_with_number1_and_number2(){
        when(calculationService.plus("1","2")).thenReturn(3);
//        ResponseEntity entity = calculationController.plus("2","3");

    }
    @Test
    void should_return_error_when_call_plus_with_number1_and_number2(){
//        assertThrows(NumberFormatException.class,()-> {calculationService.plus("b","3");});
    }
}