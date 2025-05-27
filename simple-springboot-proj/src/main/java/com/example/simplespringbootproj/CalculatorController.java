package com.example.simplespringbootproj;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/divide")
public class CalculatorController {

    @GetMapping
    public String divide(@RequestParam int a, @RequestParam int b) {
        if (b == 0) throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        return "결과: " + (a / b);
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgument(IllegalArgumentException e) {
        return "에러 발생: " + e.getMessage();
    }
}
