package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/math")
public class Addition {

    @Autowired
    Calci calci;

    @PostMapping("/add")
    public ResponseEntity<Long> addNumbers(@RequestBody TwoNumbers twoNumbers) {
        long result = calci.add(twoNumbers.getNum1(), twoNumbers.getNum2());
        return ResponseEntity.ok(result);
    }



}
