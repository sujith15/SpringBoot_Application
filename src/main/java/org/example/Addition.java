package org.example;

import org.springframework.web.bind.annotation.*;

@RestController
public class Addition {

    @GetMapping("/add")
    public long addNumbers(@RequestParam("a") long a, @RequestParam("b") long b) {
        return a + b;
    }


}
