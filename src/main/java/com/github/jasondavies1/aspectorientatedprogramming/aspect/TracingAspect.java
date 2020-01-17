package com.github.jasondavies1.aspectorientatedprogramming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TracingAspect {

    @Before(value = "execution(void printNumbers())")
    public void entering(final JoinPoint joinPoint) {
        log.info("Entering method: {}", joinPoint.getStaticPart().getSignature().toString());
    }

}
