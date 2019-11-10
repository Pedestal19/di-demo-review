package guru.springframework.demo.controllers;

import guru.springframework.demo.services.GreetingServiceImpl;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */
public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    /*public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }*/
}
