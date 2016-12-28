package org.junit.demo;

import org.junit.Test;
import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

/**
 * JUnit + spring-mock
 * @author wuxing
 */
public class Demo04 extends AbstractTransactionalDataSourceSpringContextTests {

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
