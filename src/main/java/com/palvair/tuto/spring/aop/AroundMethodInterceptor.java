package com.palvair.tuto.spring.aop;

import lombok.extern.log4j.Log4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.util.Arrays;

/**
 * Created by widdy on 30/08/14.
 */
@Log4j
public class AroundMethodInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        log.info("Method name : "
                + methodInvocation.getMethod().getName());
        log.info("Method arguments : "
                + Arrays.toString(methodInvocation.getArguments()));
        log.info("before method");
        try {
            // proceed to original method call
            Object result = methodInvocation.proceed();
            log.info("after method");
            return result;
        } catch (IllegalArgumentException e) {
            log.info("Throw exception");
            throw e;
        }
    }
}
