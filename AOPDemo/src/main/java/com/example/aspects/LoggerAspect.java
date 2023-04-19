package com.example.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Aspect
@Component
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

//    @Around("execution(* com.example.services.*.*(..))")
    @Around("execution(* com.example.services.*.*(..))")
    public void log(ProceedingJoinPoint joinPoint) throws Throwable{
        logger.info(joinPoint.getSignature().toString()+" method execution start");
        Instant start = Instant.now();
        joinPoint.proceed();
        Instant end = Instant.now();
        long elapsedTime = Duration.between(start,end).toMillis();
        logger.info("Time took to execute the method: "+elapsedTime);
        logger.info(joinPoint.getSignature().getName()+" method execution ends");
    }
}
