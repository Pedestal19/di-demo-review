package guru.springframework.demo.services;

/**
 * Author: Hosanna Gabe-Oji.
 * Project: demo.
 * Date: 11/10/2019.
 */

public class PrimaryGermanGreetingService implements GreetingService{

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
