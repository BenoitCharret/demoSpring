package com.axioconsulting.demo.spring.controller;

import com.axioconsulting.demo.spring.config.AbstractTestIT;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by benoit on 28/09/2014.
 */
public class HelloControllerTestIT extends AbstractTestIT {

    @Test
    public void testWeSeeHelloWorld() {
        drv.get(siteBase.toString()+"/hello");
        assertTrue(drv.getPageSource().contains("Welcome anonymous"));
    }

}