package com.palvair.tuto.spring.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by widdy on 30/08/14.
 */
public class ApplicationConfigurationTest {

    @Test(expected = IllegalArgumentException.class)
    public void launch() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        CustomerService service = (CustomerService) applicationContext.getBean("proxyFactoryBean");
        service.printName();
        service.printThrowException();
    }
}
