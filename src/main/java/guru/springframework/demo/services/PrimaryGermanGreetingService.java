package guru.springframework.demo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/10/2019.
 */
@Service
@Primary
@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Primarer GruBdienst";
    }
}
