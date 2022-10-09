package com.semtlers.book.web;

import com.semtlers.book.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //
public class HelloController {

    @GetMapping("/hello") //
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello/dto") //
    public HelloResponseDto helloDto(@RequestParam("name") String name, @RequestParam("amount") int amount) {
        System.out.println(name);
        System.out.println(amount);
        return new HelloResponseDto(name, amount);
    }

}
