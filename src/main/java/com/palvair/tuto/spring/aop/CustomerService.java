package com.palvair.tuto.spring.aop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Component;

/**
 * Created by widdy on 30/08/14.
 */

@Log4j
@Getter
@Setter
public class CustomerService {
    private String name;
    private String url;

    public void printName() {
        log.info("Customer name : " + this.name);
    }

    public void printURL() {
        log.info("Customer website : " + this.url);
    }

    public void printThrowException() {
        throw new IllegalArgumentException();
    }

}