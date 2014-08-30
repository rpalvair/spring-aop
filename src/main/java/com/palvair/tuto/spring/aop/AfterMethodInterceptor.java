package com.palvair.tuto.spring.aop;

import lombok.extern.log4j.Log4j;
import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by widdy on 30/08/14.
 */
@Log4j
public class AfterMethodInterceptor implements AfterReturningAdvice
{
    @Override
    public void afterReturning(Object returnValue, Method method,
                               Object[] args, Object target) throws Throwable {
        log.info("After method " + method.getName() + "()");
    }
}