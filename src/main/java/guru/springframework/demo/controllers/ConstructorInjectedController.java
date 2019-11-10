package guru.springframework.demo.controllers;

import guru.springframework.demo.services.GreetingService;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    String sayHello(){
        return greetingService.sayGreeting();
    }
}
