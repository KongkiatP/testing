package com.king.mongkut.testing.controller;

import com.king.mongkut.testing.model.NumberInput;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class Calculation {

    @RequestMapping(value = "plus", method = RequestMethod.GET)
    public ResponseEntity<?> plus(@RequestBody NumberInput numberInput) {
        {
            return ResponseEntity.ok("login");
        }
    }
}
