package com.apa.multimodule.service;

import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple Service.
 */
public class ServiceTest {
    Service service = null;

    @Before
    public void setUp() {
        service = new Service();
    }

    @Test
    public void testGetHello() {
        String result = service.getHello("testGetHello()");
        assertNotNull(result);
    }

}
