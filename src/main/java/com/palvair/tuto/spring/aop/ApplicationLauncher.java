package com.palvair.tuto.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by widdy on 30/08/14.
 */
public class ApplicationLauncher {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        CustomerService service = (CustomerService)applicationContext.getBean("proxyFactoryBean");
        service.printName();
        service.printThrowException();
    }
}
