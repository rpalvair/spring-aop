package com.palvair.tuto.spring.aop.aspectj;

import lombok.extern.log4j.Log4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * @author rpalvair
 */
@Aspect
@Log4j
public class Advice {


    @Around("execution(* com.palvair.tuto.spring.aop.CustomerService.printName(..))")
    public Object interceptPrintName(ProceedingJoinPoint joinPoint) throws Throwable {
        Object returnValue;
        try {
            log.info("Intercepted in advice");
            returnValue = joinPoint.proceed();
            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            log.info("After execution of real method :" + method.getName());
        } finally {

        }
        return returnValue;
    }

}
