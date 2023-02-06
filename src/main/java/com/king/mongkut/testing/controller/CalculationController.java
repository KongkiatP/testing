package com.king.mongkut.testing.controller;

import com.king.mongkut.testing.model.NumberInput;
import com.king.mongkut.testing.service.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculationController {

    private final CalculationService calculationService;

    @Autowired
    public CalculationController(CalculationService calculationService) {
        this.calculationService = calculationService;
    }

    @RequestMapping(value = "plus", method = RequestMethod.GET)
    public ResponseEntity<?> plus(@RequestBody NumberInput numberInput) {
        {
            return ResponseEntity.ok("login");
        }
    }
}
