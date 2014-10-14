package com.axioconsulting.demo.spring.controller;

import com.axioconsulting.demo.spring.config.AbstractTestIT;
import org.junit.Test;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertTrue;

/**
 * Created by benoit on 28/09/2014.
 */
public class HelloControllerTestIT extends AbstractTestIT {

    @Test
    public void testHelloAnonymous() {
        drv.get(siteBase.toString() + "/hello");
        assertTrue(drv.getPageSource().contains("Welcome anonymous"));
    }


    @Test
    public void testHelloAccount() {
        drv.get(siteBase.toString() + "/hello?name=toto");
        assertTrue(drv.getPageSource().contains("Hello toto"));
    }
}