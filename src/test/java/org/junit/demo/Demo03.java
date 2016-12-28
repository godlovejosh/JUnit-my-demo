package org.junit.demo;

import org.junit.Test;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 * JUnit + spring-mock
 * @author wuxing
 */
public class Demo03 extends AbstractDependencyInjectionSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        String[] config = {
                "classpath:demo-beans.xml"
        };
        return config;
    }

    private TestService testService;

    @Test
    public void test01() {
        testService.print();
    }

    public void setTestService(TestService testService) {
        this.testService = testService;
    }
}
