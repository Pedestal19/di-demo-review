package guru.springframework.demo.services;

import org.springframework.stereotype.Service;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/10/2019.
 */
@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - I was injected by the setter";
    }
}
