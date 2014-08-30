package com.palvair.tuto.spring.aop;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import java.util.Arrays;

/**
 * Created by widdy on 30/08/14.
 */
@org.springframework.context.annotation.Configuration
@ComponentScan
@ImportResource("aop-context.xml")
public class ApplicationConfiguration {

    @Bean
    public CustomerService customerService() {
        return new CustomerService();
    }

    @Bean
    public ProxyFactoryBean proxyFactoryBean() {
        ProxyFactoryBean proxy = new ProxyFactoryBean();
        proxy.setTarget(customerService());
        proxy.setInterceptorNames(new String[]{"beforeMethodInterceptor","afterMethodInterceptor","throwExceptionMethodInterceptor","aroundMethodInterceptor"});
        return proxy;
    }

}
