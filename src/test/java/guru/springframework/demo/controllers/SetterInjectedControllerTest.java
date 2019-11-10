package guru.springframework.demo.controllers;

import guru.springframework.demo.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */
public class SetterInjectedControllerTest {

    private SetterInjectedController setterInjectedController;
    @Test
    void contextLoads() {
    }

    @BeforeEach
    public void setUp() throws Exception{
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController.sayHello());
    }
}
