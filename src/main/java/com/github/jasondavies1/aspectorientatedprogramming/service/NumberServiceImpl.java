package com.github.jasondavies1.aspectorientatedprogramming.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Slf4j
@Service
public class NumberServiceImpl implements NumberService {

    @Override
    public void printNumbers(){
        IntStream.rangeClosed(1, 10)
                .forEach(System.out::println);
    }

    @Override
    public Integer add(int a, int b) {
        return a + b;
    }
}
