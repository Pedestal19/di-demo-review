package guru.springframework.demo.controllers;

import guru.springframework.demo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */

@Controller
public class PropertyInjectedController {

    @Autowired
    @Qualifier("greetingServiceImpl")
    public GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }

    /*public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }*/
}
