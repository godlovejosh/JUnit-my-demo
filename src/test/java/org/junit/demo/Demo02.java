package org.junit.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JUnit + spring-test
 * 加载spring-bean配置文件
 * @author wuxing
 */
@ContextConfiguration(locations = {
        "classpath:demo-beans.xml"
})
@RunWith(SpringJUnit4ClassRunner.class)
public class Demo02 {

    @Autowired
    private TestService testService;

    @Test
    public void test01() {
        testService.print();
    }
}
