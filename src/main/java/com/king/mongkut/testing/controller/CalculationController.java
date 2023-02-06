package com.king.mongkut.testing.controller;

import com.king.mongkut.testing.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @GetMapping("/plus")
    public ResponseEntity<?> plus(@RequestParam int number1) {
        {
            return ResponseEntity.ok("plus");
        }
    }

    @GetMapping("/minus")
    public ResponseEntity<?> minus(@RequestParam String number1, @RequestParam String number2) {
        {
            int minus = calculationService.minus(number1, number2);
            if(minus != -1) {
                return ResponseEntity.ok("plus");
            } else {
             return ResponseEntity.badRequest().body("something went wrong");
            }
        }
    }
}
