package guru.springframework.demo.services;

import org.springframework.stereotype.Service;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/8/2019.
 */
@Service
public class GreetingServiceImpl implements GreetingService {

    public static final String HELLO_GURUS = "Hello Gurus!!!! - Original";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
