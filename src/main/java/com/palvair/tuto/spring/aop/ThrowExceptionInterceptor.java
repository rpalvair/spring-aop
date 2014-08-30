package com.palvair.tuto.spring.aop;

import lombok.extern.log4j.Log4j;
import org.springframework.aop.ThrowsAdvice;

/**
 * Created by widdy on 30/08/14.
 */
@Log4j
public class ThrowExceptionInterceptor implements ThrowsAdvice {

    public void afterThrowing(Exception e) throws Throwable {
        log.info("Throw exception : " + e.getClass().getSimpleName());
    }
}