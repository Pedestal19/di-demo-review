package guru.springframework.demo.services;

import org.springframework.stereotype.Component;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/19/2019.
 */
@Component
public class GreetingRepositoryImpl implements GreetingRepository{
    @Override
    public String getEnglishGreeting() {
        return "Hello - Primary Greeting Service";
    }

    @Override
    public String getSpanishGreeting() {
        return "Servicio de Saludo Primario";
    }

    @Override
    public String getGermanGreeting() {
        return "Primarer GruBdienst";
    }
}
