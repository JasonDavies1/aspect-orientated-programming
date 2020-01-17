package com.github.jasondavies1.aspectorientatedprogramming.controller;

import com.github.jasondavies1.aspectorientatedprogramming.service.NumberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class ApplicationController {

    private final NumberService numberService;

    @GetMapping
    public void printMethod() {
        numberService.printNumbers();
    }

    @GetMapping("add")
    public void addMethod(){
        numberService.add(1, 1);
    }

}
