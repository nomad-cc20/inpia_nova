package net.nomad.inpia.cv03;

import net.nomad.inpia.cv03.controller.HelloWorldController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {DemoApplication.class})
class DemoApplicationTest {

    @Autowired
    HelloWorldController helloWorldController;

    @Test
    public void contextLoads() {

    }
}