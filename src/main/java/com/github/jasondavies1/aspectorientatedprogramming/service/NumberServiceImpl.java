package com.github.jasondavies1.aspectorientatedprogramming.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Slf4j
@Service
public class NumberServiceImpl implements NumberService {

    @Override
    public void printNumbers(){
        log.info("Printing 1 to 10");
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }

    @Override
    public Integer add(int a, int b) {
        log.info("Entered add method");
        return a + b;
    }
}
