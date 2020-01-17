package com.github.jasondavies1.aspectorientatedprogramming.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class TracingAspect {

    @Before(value = "execution(* com.github.jasondavies1.aspectorientatedprogramming.controller.*.*(..))")
    public void entering(final JoinPoint joinPoint) {
        log.info("Entering method: {}", joinPoint.getStaticPart().getSignature().getName());
    }

    @After(value = "execution(* com.github.jasondavies1.aspectorientatedprogramming.controller.*.*(..))")
    public void exiting(final JoinPoint joinPoint) {
        log.info("Exiting method: {}", joinPoint.getStaticPart().getSignature().getName());
    }

    @AfterThrowing(
            value = "execution(* com.github.jasondavies1.aspectorientatedprogramming.controller.*.*(..))",
            throwing = "exception"
    )
    public void afterThrowingException(RuntimeException exception) {

    }

}
