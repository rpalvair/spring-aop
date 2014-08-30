package com.palvair.tuto.spring.aop;

import lombok.extern.log4j.Log4j;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by widdy on 30/08/14.
 */
@Log4j
public class BeforeMethodInterceptor implements MethodBeforeAdvice
{
    @Override
    public void before(Method method, Object[] args, Object target)
            throws Throwable {
        log.info("Before method "+method.getName()+"()");
    }
}