package guru.springframework.demo.controllers;

import org.springframework.stereotype.Controller;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */
@Controller
public class MyController {

    public String hello(){
        System.out.println("Hello!!!");
        return "foo";
    }
}
