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

    @GetMapping(value = "/plus/{number1}/{number2}")
    public ResponseEntity<?> plus(@PathVariable("number1") String number1, @PathVariable("number2") String number2) {
        {
            try {
                int result = calculationService.plus(number1, number2);
                return ResponseEntity.ok(result);
            } catch (Exception ex) {
                ex.printStackTrace();
                return ResponseEntity.badRequest().body(ex.getMessage());
            }
        }
    }

    @GetMapping("/minus")
    public ResponseEntity<?> minus(@RequestParam String number1, @RequestParam String number2) {
        {
            int minus = calculationService.minus(number1, number2);
            if (minus != -1) {
                return ResponseEntity.ok(minus);
            } else {
                return ResponseEntity.badRequest().body("something went wrong");
            }
        }
    }
}
